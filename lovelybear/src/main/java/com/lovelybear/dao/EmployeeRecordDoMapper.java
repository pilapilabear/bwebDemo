package com.lovelybear.dao;

import com.lovelybear.domain.EmployeeRecordDo;

public interface EmployeeRecordDoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EmployeeRecordDo record);

    int insertSelective(EmployeeRecordDo record);

    EmployeeRecordDo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EmployeeRecordDo record);

    int updateByPrimaryKey(EmployeeRecordDo record);
}