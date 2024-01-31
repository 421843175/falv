package com.falv.service.impl;

import com.falv.mapper.ReuserMapper;
import com.falv.mapper.UserinfoMapper;
import com.falv.pojo.Reuser;
import com.falv.service.ReUserServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReUserServieImpl implements ReUserServie {

    @Autowired
    public ReuserMapper rm;

    public void userinsert(String username,String type,String info,boolean file){
        rm.insert(new Reuser(username,type,info,file));
    }




}
