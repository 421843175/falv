package com.falv.service;

import com.falv.pojo.Userinfo;

public interface UserinfoService {

    Userinfo login(String username, String password);
    int register(Userinfo userinfo);
     boolean boolPassword(String pass1,String pass2);
     int xiu(String username,String pwd1,String pwd2);
}
