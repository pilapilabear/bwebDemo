package com.lovelybear.service;

import com.lovelybear.service.model.UserModel;

public interface UserService {

    UserModel GetUserModelById(Integer id) ;
    UserModel GetUserModelByUserAccount(String account);
}
