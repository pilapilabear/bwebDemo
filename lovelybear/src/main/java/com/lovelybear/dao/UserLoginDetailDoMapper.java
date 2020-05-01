package com.lovelybear.dao;

import com.lovelybear.domain.UserLoginDetailDo;

public interface UserLoginDetailDoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserLoginDetailDo record);

    int insertSelective(UserLoginDetailDo record);

    UserLoginDetailDo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserLoginDetailDo record);

    int updateByPrimaryKey(UserLoginDetailDo record);
}