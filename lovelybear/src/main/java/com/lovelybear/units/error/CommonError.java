package com.lovelybear.units.error;

public interface CommonError {
    public int GetErrorCode();
    public String GetErrorMessage();
    public CommonError SetErrorMessage(String errorMessage);
}
