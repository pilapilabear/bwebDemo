package com.lovelybear.service.impl;

import com.lovelybear.dao.RolePermissionDoMapper;
import com.lovelybear.domain.RolePermissionDo;
import com.lovelybear.service.RolePermissionService;
import com.lovelybear.service.model.RolePermissionModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class RolePermissionServiceImpl implements RolePermissionService {

    @Autowired
    private RolePermissionDoMapper rolePermissionDoMapper;
    @Override
    public List<RolePermissionModel> GetPermissionByRoleIds(List<Integer> roleIds) {
        List<RolePermissionDo>  rolePermissionDos=  rolePermissionDoMapper.selectByRoleIds(roleIds);
        if (rolePermissionDos==null || rolePermissionDos.isEmpty())
        {
            return null;
        }
        return rolePermissionDos.stream().map(item->{
            RolePermissionModel rolePermissionModel=ConvertModelFromEntity(item);
            return rolePermissionModel;
        }).collect(Collectors.toList());
    }

    private RolePermissionModel ConvertModelFromEntity(RolePermissionDo rolePermissionDo) {
        if (rolePermissionDo==null)
        {
            return null;
        }
        RolePermissionModel rolePermissionModel =new RolePermissionModel();
        BeanUtils.copyProperties(rolePermissionDo,rolePermissionModel);
        return  rolePermissionModel;
    }
}
