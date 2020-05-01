package com.lovelybear.service.impl;

import com.lovelybear.dao.UserPermissionDoMapper;
import com.lovelybear.domain.UserPermissionDo;
import com.lovelybear.service.UserPermissionService;
import com.lovelybear.service.model.UserPermissionModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserPermissionServiceImpl implements UserPermissionService {

    @Autowired
    private UserPermissionDoMapper userPermissionDoMapper;
    @Override
    public List<UserPermissionModel> GetPermissionByUserId(Integer userId) {
        List<UserPermissionDo> userPermissionDos=userPermissionDoMapper.selectPermissionsByUserId(userId);
        if (userPermissionDos==null || userPermissionDos.isEmpty())
        {
            return null;
        }
        return userPermissionDos.stream().map(item->{
            UserPermissionModel userPermissionModel=ConvertModelFromEntity(item);
            return userPermissionModel;
        }).collect(Collectors.toList());
    }

    private UserPermissionModel ConvertModelFromEntity(UserPermissionDo userPermissionDo) {
        if (userPermissionDo==null)
        {
            return null;
        }
        UserPermissionModel userPermissionModel = new UserPermissionModel();
        BeanUtils.copyProperties(userPermissionDo,userPermissionModel);
        return  userPermissionModel;
    }
}
