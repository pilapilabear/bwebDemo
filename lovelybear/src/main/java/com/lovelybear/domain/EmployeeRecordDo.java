package com.lovelybear.domain;

import java.util.Date;

public class EmployeeRecordDo {
    private Integer id;

    private Date satrtDate;

    private Date endDate;

    private String workUnit;

    private String position;

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

    public String getWorkUnit() {
        return workUnit;
    }

    public void setWorkUnit(String workUnit) {
        this.workUnit = workUnit == null ? null : workUnit.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}