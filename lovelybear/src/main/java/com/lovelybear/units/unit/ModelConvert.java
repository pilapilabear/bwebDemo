package com.lovelybear.units.unit;

import org.springframework.beans.BeanUtils;

public   class ModelConvert {

    public static   <T,V> V Convert(T tSource,V vTarget){
        if (tSource==null ||vTarget==null)
        {
            return null;
        }
        BeanUtils.copyProperties(tSource,vTarget);
        return  vTarget;
    }
}
