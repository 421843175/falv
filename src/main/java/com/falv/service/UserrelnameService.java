package com.falv.service;

import com.falv.pojo.Userrelname;
import com.falv.pojo.Usertable;

public interface UserrelnameService {
     void insert(Userrelname usertable);

     Userrelname select(Userrelname username);

     void updateUser(Userrelname userrelname);
}
