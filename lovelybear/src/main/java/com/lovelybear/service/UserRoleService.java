package com.lovelybear.service;

import com.lovelybear.service.model.UserRoleModel;

import java.util.List;

public interface UserRoleService {
    List<UserRoleModel> GetRoleByUserId(Integer userId);
}
