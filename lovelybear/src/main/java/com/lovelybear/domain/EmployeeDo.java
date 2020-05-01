package com.lovelybear.domain;

import java.util.Date;

public class EmployeeDo {
    private Integer id;

    private String name;

    private String gender;

    private Date birthday;

    private String telephone;

    private String landlinePhone;

    private String address;

    private Integer leaderId;

    private String leaderName;

    private String politicsStatusName;

    private Integer politicsStatusId;

    private Date inductionDate;

    private Integer positionId;

    private Integer educationId;

    private String educationName;

    private String nationName;

    private Integer nationId;

    private Integer isMarried;

    private String idNumber;

    private Integer birthplaceId;

    private String birthplaceName;

    private String creator;

    private Date createDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getLandlinePhone() {
        return landlinePhone;
    }

    public void setLandlinePhone(String landlinePhone) {
        this.landlinePhone = landlinePhone == null ? null : landlinePhone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getLeaderId() {
        return leaderId;
    }

    public void setLeaderId(Integer leaderId) {
        this.leaderId = leaderId;
    }

    public String getLeaderName() {
        return leaderName;
    }

    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName == null ? null : leaderName.trim();
    }

    public String getPoliticsStatusName() {
        return politicsStatusName;
    }

    public void setPoliticsStatusName(String politicsStatusName) {
        this.politicsStatusName = politicsStatusName == null ? null : politicsStatusName.trim();
    }

    public Integer getPoliticsStatusId() {
        return politicsStatusId;
    }

    public void setPoliticsStatusId(Integer politicsStatusId) {
        this.politicsStatusId = politicsStatusId;
    }

    public Date getInductionDate() {
        return inductionDate;
    }

    public void setInductionDate(Date inductionDate) {
        this.inductionDate = inductionDate;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
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

    public String getNationName() {
        return nationName;
    }

    public void setNationName(String nationName) {
        this.nationName = nationName == null ? null : nationName.trim();
    }

    public Integer getNationId() {
        return nationId;
    }

    public void setNationId(Integer nationId) {
        this.nationId = nationId;
    }

    public Integer getIsMarried() {
        return isMarried;
    }

    public void setIsMarried(Integer isMarried) {
        this.isMarried = isMarried;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    public Integer getBirthplaceId() {
        return birthplaceId;
    }

    public void setBirthplaceId(Integer birthplaceId) {
        this.birthplaceId = birthplaceId;
    }

    public String getBirthplaceName() {
        return birthplaceName;
    }

    public void setBirthplaceName(String birthplaceName) {
        this.birthplaceName = birthplaceName == null ? null : birthplaceName.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}