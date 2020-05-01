package com.lovelybear.domain;

public class DictSmallDo {
    private Integer id;

    private Integer dictBigId;

    private String code;

    private String name;

    private Integer isSysInit;

    private String desc;

    private String dictBigNm;

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

    public Integer getIsSysInit() {
        return isSysInit;
    }

    public void setIsSysInit(Integer isSysInit) {
        this.isSysInit = isSysInit;
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
}