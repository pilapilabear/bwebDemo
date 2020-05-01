package com.lovelybear.controller;


import com.lovelybear.units.error.BusinessException;
import com.lovelybear.units.error.EnBusinessError;
import com.lovelybear.units.response.CommonReturnType;
import com.lovelybear.units.validator.ValidatorImpl;
import org.apache.shiro.authz.UnauthenticatedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class BaseController {

    @Autowired
    protected ValidatorImpl validator;
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.OK)
    public Object handlerException(HttpServletRequest request, Exception ex)
    {
        Map<String,Object> responseData=new HashMap<>();
        if(ex instanceof BusinessException)
        {
            BusinessException businessException=(BusinessException)ex;
            responseData.put("errorCode", businessException.GetErrorCode());
            responseData.put("errorMessage",businessException.GetErrorMessage());
        }
        else if(ex instanceof UnauthenticatedException)
        {
            responseData.put("errorCode", EnBusinessError.UNAUTHORIZED.GetErrorCode());
            responseData.put("errorMessage",EnBusinessError.UNAUTHORIZED.GetErrorMessage());
        }
        else {

            responseData.put("errorCode", EnBusinessError.UNKNOWN_ERROR.GetErrorCode());
            responseData.put("errorMessage",EnBusinessError.UNKNOWN_ERROR.GetErrorMessage());
        }
        return CommonReturnType.create(responseData,"fail");
    }
}
