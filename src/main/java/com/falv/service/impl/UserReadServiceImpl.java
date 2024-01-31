package com.falv.service.impl;

import com.falv.mapper.UserreadMapper;
import com.falv.pojo.Userread;
import com.falv.service.UserReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserReadServiceImpl implements UserReadService {

    @Autowired
    UserreadMapper urm;

    public List<Userread> selectOne(String username)
    {
        return urm.selectOne(username);
    }

    public int count(String username){
        return urm.countread(username);
    }

    public void updateSetRead(Integer id){
        urm.updateSetRead(id);
    }
}
