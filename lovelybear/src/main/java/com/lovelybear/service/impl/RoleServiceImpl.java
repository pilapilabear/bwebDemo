package com.lovelybear.service.impl;

import com.lovelybear.dao.RoleDoMapper;
import com.lovelybear.domain.RoleDo;
import com.lovelybear.service.RoleService;
import com.lovelybear.service.model.RoleModel;
import com.lovelybear.units.unit.ModelConvert;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private   RoleDoMapper roleDoMapper;
    @Override
    public RoleModel GetById(Integer id){
        RoleDo roleDo=roleDoMapper.selectByPrimaryKey(id);
        if (roleDo==null)
        {
            return null;
        }
        RoleModel roleModel=new RoleModel();
        return ModelConvert.Convert(roleDo,roleModel);
    }

    private RoleModel ConvertModelFromEntity(RoleDo roleDo) {
        if (roleDo==null)
        {
            return null;
        }
        RoleModel roleModel = new RoleModel();
        BeanUtils.copyProperties(roleDo,roleModel);
        return  roleModel;
    }
}
