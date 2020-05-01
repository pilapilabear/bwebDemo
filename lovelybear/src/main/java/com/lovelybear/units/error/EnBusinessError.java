package com.lovelybear.units.error;


public enum EnBusinessError implements CommonError {

    //全局未知错误
    PARAMETER_VALIDATION_ERROR(10001,"参数错误"),
    UNKNOWN_ERROR(10002,"未知错误"),
    UNAUTHORIZED(10003,"用户未登录或没有此功能权限"),
    USER_NOT_EXIST(20001,"用户名不存在"),
    USER_Pwd_ERROR(20002,"用户名或密码错误"),
    ;
    private EnBusinessError(int code,String message)
    {
        this.errorCode=code;
        this.errorMessage=message;
    }
    private int errorCode;
    private String errorMessage;
    @Override
    public int GetErrorCode() {
        return this.errorCode;
    }

    @Override
    public String GetErrorMessage() {
        return this.errorMessage;
    }

    @Override
    public CommonError SetErrorMessage(String errorMessage) {
        this.errorMessage=errorMessage;
        return this;
    }
}
