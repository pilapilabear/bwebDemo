package com.lovelybear.domain;

public class DictDetailDo {
    private Integer id;

    private Integer dictBigId;

    private Integer dictSmallId;

    private String code;

    private String name;

    private Integer level;

    private String nm;

    private Integer isLeaf;

    private Integer isSysInit;

    private Integer isDisable;

    private String desc;

    private String dictBigNm;

    private String dictSmallNm;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDictBigId() {
        return dictBigId;
    }

    public void setDictBigId(Integer dictBigId) {
        this.dictBigId = dictBigId;
    }

    public Integer getDictSmallId() {
        return dictSmallId;
    }

    public void setDictSmallId(Integer dictSmallId) {
        this.dictSmallId = dictSmallId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getNm() {
        return nm;
    }

    public void setNm(String nm) {
        this.nm = nm == null ? null : nm.trim();
    }

    public Integer getIsLeaf() {
        return isLeaf;
    }

    public void setIsLeaf(Integer isLeaf) {
        this.isLeaf = isLeaf;
    }

    public Integer getIsSysInit() {
        return isSysInit;
    }

    public void setIsSysInit(Integer isSysInit) {
        this.isSysInit = isSysInit;
    }

    public Integer getIsDisable() {
        return isDisable;
    }

    public void setIsDisable(Integer isDisable) {
        this.isDisable = isDisable;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public String getDictBigNm() {
        return dictBigNm;
    }

    public void setDictBigNm(String dictBigNm) {
        this.dictBigNm = dictBigNm == null ? null : dictBigNm.trim();
    }

    public String getDictSmallNm() {
        return dictSmallNm;
    }

    public void setDictSmallNm(String dictSmallNm) {
        this.dictSmallNm = dictSmallNm == null ? null : dictSmallNm.trim();
    }
}