package com.lovelybear.domain;

import java.util.Date;

public class EmployeeStudyDo {
    private Integer id;

    private Date satrtDate;

    private Date endDate;

    private String schoolName;

    private Integer educationId;

    private String educationName;

    private Integer degreeId;

    private String degreeName;

    private Integer isNational;

    private Date createDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getSatrtDate() {
        return satrtDate;
    }

    public void setSatrtDate(Date satrtDate) {
        this.satrtDate = satrtDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName == null ? null : schoolName.trim();
    }

    public Integer getEducationId() {
        return educationId;
    }

    public void setEducationId(Integer educationId) {
        this.educationId = educationId;
    }

    public String getEducationName() {
        return educationName;
    }

    public void setEducationName(String educationName) {
        this.educationName = educationName == null ? null : educationName.trim();
    }

    public Integer getDegreeId() {
        return degreeId;
    }

    public void setDegreeId(Integer degreeId) {
        this.degreeId = degreeId;
    }

    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName == null ? null : degreeName.trim();
    }

    public Integer getIsNational() {
        return isNational;
    }

    public void setIsNational(Integer isNational) {
        this.isNational = isNational;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}