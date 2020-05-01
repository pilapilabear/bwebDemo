package com.lovelybear.dao;

import com.lovelybear.domain.DepartmentDo;

public interface DepartmentDoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DepartmentDo record);

    int insertSelective(DepartmentDo record);

    DepartmentDo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DepartmentDo record);

    int updateByPrimaryKey(DepartmentDo record);
}