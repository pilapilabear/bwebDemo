package com.lovelybear.dao;

import com.lovelybear.domain.UserPermissionDo;

import java.util.List;

public interface UserPermissionDoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserPermissionDo record);

    int insertSelective(UserPermissionDo record);

    UserPermissionDo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserPermissionDo record);

    int updateByPrimaryKey(UserPermissionDo record);

    List<UserPermissionDo> selectPermissionsByUserId(Integer userId);
}