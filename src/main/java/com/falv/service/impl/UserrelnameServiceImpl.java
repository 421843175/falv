package com.falv.service.impl;


import com.falv.mapper.UserrelnameMapper;
import com.falv.pojo.Userrelname;

import com.falv.service.UserrelnameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserrelnameServiceImpl implements UserrelnameService {
    @Autowired
    UserrelnameMapper um;
    public void insert(Userrelname usertable){
        um.insert(usertable);
    }

    public Userrelname select(Userrelname username){
        return um.selectone(username);
    }

    public void updateUser(Userrelname userrelname){
        um.updateone(userrelname);
    }



}
