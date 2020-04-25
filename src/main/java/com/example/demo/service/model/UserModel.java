package com.example.demo.service.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class UserModel {

    private  Integer id;
    @JsonIgnore
    private  String name;

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
        this.name = name;
    }
}
