package com.lovelybear.service;

import com.lovelybear.service.model.RolePermissionModel;

import java.util.List;

public interface RolePermissionService {
   List<RolePermissionModel> GetPermissionByRoleIds(List<Integer> roleIds);
}
