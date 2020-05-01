package com.lovelybear.dao;

import com.lovelybear.domain.DictBigDo;

public interface DictBigDoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DictBigDo record);

    int insertSelective(DictBigDo record);

    DictBigDo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DictBigDo record);

    int updateByPrimaryKey(DictBigDo record);
}