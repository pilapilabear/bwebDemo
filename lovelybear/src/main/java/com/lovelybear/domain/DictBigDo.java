package com.lovelybear.domain;

public class DictBigDo {
    private Integer id;

    private String code;

    private String name;

    private Integer isSysInit;

    private String desc;

    private String nm;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getNm() {
        return nm;
    }

    public void setNm(String nm) {
        this.nm = nm == null ? null : nm.trim();
    }
}