package com.lovelybear.service.impl;

import com.lovelybear.dao.RoleDoMapper;
import com.lovelybear.dao.UserRoleDoMapper;
import com.lovelybear.domain.RoleDo;
import com.lovelybear.domain.UserRoleDo;
import com.lovelybear.service.UserRoleService;
import com.lovelybear.service.model.UserRoleModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    private UserRoleDoMapper userRoleDoMapper;
    @Autowired
    private RoleDoMapper roleDoMapper;
    @Override
    public List<UserRoleModel> GetRoleByUserId(Integer userId) {

        List<UserRoleDo> userRoleDos=userRoleDoMapper.selectByUserId(userId);
        if (userRoleDos==null ||userRoleDos.isEmpty())
        {
            return null;
        }
        return userRoleDos.stream().map(item->{
            UserRoleModel userRoleModel=ConvertModelFromEntity(item);
            if (userRoleModel!=null)
            {
                RoleDo roleDo=roleDoMapper.selectByPrimaryKey(item.getRoleId());
               if (roleDo!=null)
               {
                   userRoleModel.setCode(roleDo.getCode());
               }
            }
            return userRoleModel;
        }).collect(Collectors.toList());
    }

    private UserRoleModel ConvertModelFromEntity(UserRoleDo userRoleDo) {
        if (userRoleDo==null)
        {
            return null;
        }
        UserRoleModel userRoleModel = new UserRoleModel();
        BeanUtils.copyProperties(userRoleDo,userRoleModel);
        return  userRoleModel;
    }
}
