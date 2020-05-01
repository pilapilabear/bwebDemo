package com.lovelybear.dao;

import com.lovelybear.domain.EmployeePositionDo;

public interface EmployeePositionDoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EmployeePositionDo record);

    int insertSelective(EmployeePositionDo record);

    EmployeePositionDo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EmployeePositionDo record);

    int updateByPrimaryKey(EmployeePositionDo record);
}