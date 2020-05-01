package com.lovelybear.dao;

import com.lovelybear.domain.UserRoleDo;

import java.util.List;

public interface UserRoleDoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserRoleDo record);

    int insertSelective(UserRoleDo record);

    UserRoleDo selectByPrimaryKey(Integer id);

    List<UserRoleDo> selectByUserId(Integer userId);

    int updateByPrimaryKeySelective(UserRoleDo record);

    int updateByPrimaryKey(UserRoleDo record);
}