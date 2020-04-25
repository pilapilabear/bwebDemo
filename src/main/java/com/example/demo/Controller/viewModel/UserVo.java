package com.example.demo.Controller.viewModel;
import com.alibaba.fastjson.annotation.JSONField;

import javax.validation.constraints.NotBlank;

public class UserVo {
    private Integer id;
    @NotBlank(message = "用户名不能为空")
//    @JSONField(serialize = false)
    private String name;

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
