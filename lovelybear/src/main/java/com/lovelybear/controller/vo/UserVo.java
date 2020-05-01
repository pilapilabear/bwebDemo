package com.lovelybear.controller.vo;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class UserVo {
    private Integer id;
    private String realName;
    @NotBlank(message = "用户名不能为空")
    private String account;
    @NotBlank(message = "密码不能为空")
    private String pwd;
    private Integer isDisable;
}
