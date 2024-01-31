package com.falv.service.impl;

import com.falv.mapper.UsermassageMapper;
import com.falv.pojo.Usermassage;
import com.falv.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsermassageMapper um;
    public void add(String comments,String username){
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));

        System.out.println("username="+username+",comments="+comments);
        um.insert(new Usermassage(username,comments,(new SimpleDateFormat("yyyy-MM-ddHH:mm:ss").format(new Date()))+""));
    }
}
