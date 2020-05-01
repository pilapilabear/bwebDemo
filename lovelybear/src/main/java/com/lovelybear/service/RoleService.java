package com.lovelybear.service;

import com.lovelybear.service.model.RoleModel;

public interface RoleService {

    RoleModel GetById(Integer id) throws InstantiationException, IllegalAccessException;
}
