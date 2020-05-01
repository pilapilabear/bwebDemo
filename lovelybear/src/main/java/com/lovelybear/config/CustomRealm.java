package com.lovelybear.config;


import com.lovelybear.service.RolePermissionService;
import com.lovelybear.service.UserPermissionService;
import com.lovelybear.service.UserRoleService;
import com.lovelybear.service.UserService;
import com.lovelybear.service.model.RolePermissionModel;
import com.lovelybear.service.model.UserModel;
import com.lovelybear.service.model.UserPermissionModel;
import com.lovelybear.service.model.UserRoleModel;
import com.lovelybear.units.unit.JWTToken;
import com.lovelybear.units.unit.JWTUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;

@Component
public class CustomRealm extends AuthorizingRealm {
    private final UserService userService;
    private final UserRoleService userRoleService;
    private final RolePermissionService rolePermissionService;
    private final UserPermissionService userPermissionService;

    @Autowired
    public CustomRealm(UserService userService, UserRoleService userRoleService, RolePermissionService rolePermissionService, UserPermissionService userPermissionService) {
        this.userService = userService;
        this.userRoleService = userRoleService;
        this.rolePermissionService = rolePermissionService;
        this.userPermissionService = userPermissionService;
    }

    /**
     * 必须重写此方法，不然会报错
     */
    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof JWTToken;
    }

    /**
     * 默认使用此方法进行用户名正确与否验证，错误抛出异常即可。
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("————身份认证方法————");
        String token = (String) authenticationToken.getCredentials();
        // 解密获得username，用于和数据库进行对比
        String username = JWTUtil.getUsername(token);
        UserModel userModel = userService.GetUserModelByUserAccount(username);
        if (userModel == null || StringUtils.isEmpty(userModel.getPwd())) {
            throw new AuthenticationException("该用户不存在！");
        }
        if (username == null || !JWTUtil.verify(token, username,userModel.getSalt())) {
            throw new AuthenticationException("token认证失败！");
        }

        int ban = userModel.getIsDisable();
        if (ban == 1) {
            throw new AuthenticationException("该用户已被封号！");
        }
        return new SimpleAuthenticationInfo(token, token, "MyRealm");
    }

    /**
     * 只有当需要检测用户权限的时候才会调用此方法，例如checkRole,checkPermission之类的
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        System.out.println("————权限认证————");
        String username = JWTUtil.getUsername(principals.toString());
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();

        List<UserRoleModel> userRoleModels=new ArrayList<>();;
        List<RolePermissionModel> rolePermissions=new ArrayList<>();
        List<UserPermissionModel> userPermissions=new ArrayList<>();

        UserModel userModel = userService.GetUserModelByUserAccount(username);
        if (userModel!=null)
        {
            //获得该用户角色
            userRoleModels = userRoleService.GetRoleByUserId(userModel.getId());
            if (userRoleModels!=null&&!userRoleModels.isEmpty())
            {
                //每个角色拥有默认的权限
                rolePermissions = rolePermissionService.GetPermissionByRoleIds(userRoleModels.stream().map(item->{ return item.getRoleId();}).collect(Collectors.toList()));
            }
            //每个用户可以设置新的权限
            userPermissions = userPermissionService.GetPermissionByUserId(userModel.getId());
        }

        Set<String> roleSet = new HashSet<>();
        Set<String> permissionSet = new HashSet<>();
        //需要将 role, permission 封装到 Set 作为 info.setRoles(), info.setStringPermissions() 的参数
        if (userRoleModels!=null&&!userRoleModels.isEmpty())
        {
            roleSet.addAll(userRoleModels.stream().map(item->{return item.getCode();}).collect(Collectors.toList()));
        }
        if (rolePermissions!=null&&!rolePermissions.isEmpty())
        {
            permissionSet.addAll(rolePermissions.stream().map(item->{return item.getPerms();}).collect(Collectors.toList()));
        }
        if (userPermissions!=null&&!userPermissions.isEmpty())
        {
            permissionSet.addAll(userPermissions.stream().map(item->{return item.getPerms();}).collect(Collectors.toList()));
        }


        //设置该用户拥有的角色和权限
        info.setRoles(roleSet);
        info.setStringPermissions(permissionSet);
        return info;
    }
}

