package com.lovelybear.dao;

import com.lovelybear.domain.RolePermissionDo;

import java.util.List;

public interface RolePermissionDoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RolePermissionDo record);

    int insertSelective(RolePermissionDo record);

    RolePermissionDo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RolePermissionDo record);

    int updateByPrimaryKey(RolePermissionDo record);

    List<RolePermissionDo> selectByRoleIds(List<Integer> roleIdsList);
}