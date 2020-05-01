package com.lovelybear.dao;

import com.lovelybear.domain.EmployeeDo;

public interface EmployeeDoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EmployeeDo record);

    int insertSelective(EmployeeDo record);

    EmployeeDo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EmployeeDo record);

    int updateByPrimaryKey(EmployeeDo record);
}