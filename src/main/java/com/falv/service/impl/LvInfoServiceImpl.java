package com.falv.service.impl;

import com.falv.mapper.LvinfoMapper;
import com.falv.service.LvInfoService;
import org.springframework.beans.factory.annotation.Autowired;

public class LvInfoServiceImpl implements LvInfoService {

    @Autowired
    public LvinfoMapper lm;

//    public void seeInfo(){
//        lm.insertSelective()
//    }
}
