package com.lovelybear.dao;

import com.lovelybear.domain.DictSmallDo;

public interface DictSmallDoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DictSmallDo record);

    int insertSelective(DictSmallDo record);

    DictSmallDo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DictSmallDo record);

    int updateByPrimaryKey(DictSmallDo record);
}