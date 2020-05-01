package com.lovelybear.dao;

import com.lovelybear.domain.RoleDo;

public interface RoleDoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RoleDo record);

    int insertSelective(RoleDo record);

    RoleDo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RoleDo record);

    int updateByPrimaryKey(RoleDo record);
}