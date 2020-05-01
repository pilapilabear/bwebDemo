package com.lovelybear.service;

import com.lovelybear.service.model.UserPermissionModel;

import java.util.List;

public interface UserPermissionService {
    List<UserPermissionModel> GetPermissionByUserId(Integer userId);
}
