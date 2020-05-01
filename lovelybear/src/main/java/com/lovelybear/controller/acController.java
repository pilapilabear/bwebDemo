package com.lovelybear.controller;

import com.lovelybear.controller.vo.UserVo;
import com.lovelybear.service.UserService;
import com.lovelybear.service.model.UserModel;
import com.lovelybear.units.error.BusinessException;
import com.lovelybear.units.error.EnBusinessError;
import com.lovelybear.units.response.CommonReturnType;
import com.lovelybear.units.unit.ModelConvert;
import com.lovelybear.units.unit.JWTUtil;
import com.lovelybear.units.validator.ValidationResult;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.bouncycastle.pqc.math.linearalgebra.IntUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.io.UnsupportedEncodingException;


@RestController
@RequestMapping("/test")
public class acController extends BaseController {

    @Autowired
    private UserService userService;
    @RequestMapping("/getUser")
    @RequiresPermissions("sys:test:getUser")
    public CommonReturnType GetUser(Integer id)
    {
        UserVo userVo=new UserVo();
        UserModel userModel=userService.GetUserModelById(id);
        if (userModel==null)
        {
            return CommonReturnType.create(null);
        }
        userVo= ModelConvert.Convert(userModel,userVo);
        return CommonReturnType.create(userVo);
    }

    @PostMapping("/login")
    public CommonReturnType login(@RequestBody UserVo user) throws BusinessException, UnsupportedEncodingException {
        ValidationResult result=validator.validate(user);
        if (result.isHasErrors())
        {
            throw new BusinessException(EnBusinessError.PARAMETER_VALIDATION_ERROR,result.getErrMsg());
        }
        UserModel userModel= userService.GetUserModelByUserAccount(user.getAccount());
        if (StringUtils.isEmpty(userModel.getPwd()) || !userModel.getPwd().equals(user.getPwd()))
        {
            throw new BusinessException(EnBusinessError.USER_Pwd_ERROR);
        }
        return CommonReturnType.create(JWTUtil.createToken(userModel.getAccount(),userModel.getSalt()));

    }
}
