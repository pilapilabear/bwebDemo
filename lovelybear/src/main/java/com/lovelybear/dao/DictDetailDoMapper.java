package com.lovelybear.dao;

import com.lovelybear.domain.DictDetailDo;

public interface DictDetailDoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DictDetailDo record);

    int insertSelective(DictDetailDo record);

    DictDetailDo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DictDetailDo record);

    int updateByPrimaryKey(DictDetailDo record);
}