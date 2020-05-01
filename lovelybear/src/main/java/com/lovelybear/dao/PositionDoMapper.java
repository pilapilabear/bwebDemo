package com.lovelybear.dao;

import com.lovelybear.domain.PositionDo;

public interface PositionDoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PositionDo record);

    int insertSelective(PositionDo record);

    PositionDo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PositionDo record);

    int updateByPrimaryKey(PositionDo record);
}