package com.lovelybear.service.impl;

import com.lovelybear.dao.UserDoMapper;
import com.lovelybear.domain.UserDo;
import com.lovelybear.service.UserService;
import com.lovelybear.service.model.UserModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDoMapper userDoMapper;
    @Override
    public UserModel GetUserModelById(Integer id) {
        UserDo userDo=userDoMapper.selectByPrimaryKey(id);
        if (userDo==null)
        {
            return null;
        }
        return ConvertFromEntity(userDo);
    }

    @Override
    public UserModel GetUserModelByUserAccount(String account)  {
        UserDo userDo=userDoMapper.SelectByUserAccount(account);
        UserModel userModel=new UserModel();
        if (userDo!=null)
        {
            userModel=ConvertFromEntity(userDo);
        }
        return userModel;
    }
    private UserModel ConvertFromEntity( UserDo userDo) {
        if (userDo==null)
        {
            return null;
        }
        UserModel userModel=new UserModel();
        BeanUtils.copyProperties(userDo,userModel);
        return  userModel;
    }
}

