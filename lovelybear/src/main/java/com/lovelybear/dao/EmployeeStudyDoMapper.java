package com.lovelybear.dao;

import com.lovelybear.domain.EmployeeStudyDo;

public interface EmployeeStudyDoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EmployeeStudyDo record);

    int insertSelective(EmployeeStudyDo record);

    EmployeeStudyDo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EmployeeStudyDo record);

    int updateByPrimaryKey(EmployeeStudyDo record);
}