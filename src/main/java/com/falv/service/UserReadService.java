package com.falv.service;

import com.falv.pojo.Userread;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserReadService {

    List<Userread> selectOne(String username);
    int count(String username);
    void updateSetRead(Integer id);
}
