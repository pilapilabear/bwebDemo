package com.lovelybear.units.error;


//包装器业务异常类实现
public class BusinessException extends Exception implements CommonError {

    private CommonError commonError;
    public BusinessException(CommonError commonError)
    {
        super();
        this.commonError=commonError;
    }
    public BusinessException(CommonError commonError,String errorMessage)
    {
        super();
        this.commonError=commonError;
        this.commonError.SetErrorMessage(errorMessage);
    }
    @Override
    public int GetErrorCode() {
        return this.commonError.GetErrorCode();
    }

    @Override
    public String GetErrorMessage() {
        return this.commonError.GetErrorMessage();
    }

    @Override
    public CommonError SetErrorMessage(String errorMessage) {
        this.commonError.SetErrorMessage(errorMessage);
        return this;
    }
}
