package com.example.demo.service.impl;

import com.example.demo.dao.UserDoMapper;
import com.example.demo.entity.UserDo;
import com.example.demo.service.UserService;
import com.example.demo.service.model.UserModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDoMapper userDoMapper;
    @Override
    public UserModel GetUserById(Integer id) {
        UserDo userDo=userDoMapper.selectByPrimaryKey(id);
        return ConvertFromEntity(userDo);
    }

    private UserModel ConvertFromEntity( UserDo userDo)
    {
        if (userDo==null)
        {
            return null;
        }
        UserModel userModel=new UserModel();
        BeanUtils.copyProperties(userDo,userModel);
        return  userModel;
    }
}
