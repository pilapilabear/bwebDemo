package com.example.demo.Controller;

import com.example.demo.Controller.viewModel.UserVo;
import com.example.demo.error.BusinessException;
import com.example.demo.error.EnBusinessError;
import com.example.demo.response.CommonReturnType;
import com.example.demo.service.UserService;
import com.example.demo.service.model.UserModel;
import com.example.demo.validator.ValidationResult;
import com.example.demo.validator.ValidatorImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/test")
@CrossOrigin(allowCredentials="true",allowedHeaders="*")
public class UserController {

    private static final String CONTENT_TYPE_FORMED="application/x-www-form-urlencoded";
    private final static Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;
    @Autowired
    private ValidatorImpl validator;

   /* @CrossOrigin
    @GetMapping(value = "/getUser",consumes = {CONTENT_TYPE_FORMED})*/
    @GetMapping(value = "/getUser")
    public CommonReturnType GetUser(@RequestParam(name="id") Integer id) throws BusinessException
    {
        UserModel userModel =  userService.GetUserById(id);
        if(userModel==null)
        {
          throw new BusinessException(EnBusinessError.USER_NOT_EXIST);
        }
        UserVo userVo= ConvertFromModel(userModel);
        userVo.setName("张四");
        logger.debug("hello Sfl4j + logback......");
        return CommonReturnType.create(userVo);
    }
    @PostMapping("/add")
    public CommonReturnType AddUser(@RequestBody UserVo userVo) throws BusinessException
    {
        ValidationResult result=validator.validate(userVo);
        if (result.isHasErrors())
        {
            throw new BusinessException(EnBusinessError.PARAMETER_VALIDATION_ERROR,result.getErrMsg());
        }
        return  CommonReturnType.create("成功");
    }


    private UserVo ConvertFromModel(UserModel userModel)
    {
        if(userModel==null)
        {
            return null;
        }
        UserVo userVo=new UserVo();
        BeanUtils.copyProperties(userModel,userVo);
        return userVo;
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.OK)
    public Object handlerException(HttpServletRequest request,Exception ex)
    {
        Map<String,Object> responseData=new HashMap<>();
        if(ex instanceof BusinessException)
        {
            BusinessException businessException=(BusinessException)ex;
            responseData.put("errorCode", businessException.GetErrorCode());
            responseData.put("errorMessage",businessException.GetErrorMessage());
        }
        else {

            responseData.put("errorCode", EnBusinessError.UNKNOWN_ERROR.GetErrorCode());
            responseData.put("errorMessage",EnBusinessError.UNKNOWN_ERROR.GetErrorMessage());
        }
        return CommonReturnType.create(responseData,"fail");
    }
}
