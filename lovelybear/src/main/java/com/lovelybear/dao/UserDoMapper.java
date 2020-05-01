package com.lovelybear.dao;

import com.lovelybear.domain.UserDo;

public interface UserDoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserDo record);

    int insertSelective(UserDo record);

    UserDo selectByPrimaryKey(Integer id);

    UserDo SelectByUserAccount(String account);

    int updateByPrimaryKeySelective(UserDo record);

    int updateByPrimaryKey(UserDo record);
}