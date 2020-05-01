package com.lovelybear.dao;

import com.lovelybear.domain.EmployeeRelationDo;

public interface EmployeeRelationDoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EmployeeRelationDo record);

    int insertSelective(EmployeeRelationDo record);

    EmployeeRelationDo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EmployeeRelationDo record);

    int updateByPrimaryKey(EmployeeRelationDo record);
}