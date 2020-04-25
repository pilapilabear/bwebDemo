package com.example.demo.error;

public enum EnBusinessError implements CommonError {

    //全局未知错误
    PARAMETER_VALIDATION_ERROR(10001,"参数错误"),
    UNKNOWN_ERROR(10002,"未知错误"),
    USER_NOT_EXIST(20001,"用户不存在")
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
