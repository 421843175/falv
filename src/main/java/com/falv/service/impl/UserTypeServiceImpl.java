package com.falv.service.impl;

import com.falv.mapper.RetypeMapper;
import com.falv.pojo.Retype;
import com.falv.service.UserTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserTypeServiceImpl implements UserTypeService{
        @Autowired
    public RetypeMapper rm;
        public void insert(String username,String type,String info){
            rm.insert(new Retype(username,type,info));

        }
}
