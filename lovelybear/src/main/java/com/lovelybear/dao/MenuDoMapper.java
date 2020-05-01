package com.lovelybear.dao;

import com.lovelybear.domain.MenuDo;

public interface MenuDoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MenuDo record);

    int insertSelective(MenuDo record);

    MenuDo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MenuDo record);

    int updateByPrimaryKey(MenuDo record);
}