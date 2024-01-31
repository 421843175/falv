package com.falv.service.impl;

import com.falv.dao.TestMapper;
import com.falv.pojo.BPojo;
import com.falv.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper tm;

    @Override
    public BPojo get(Integer id) {
        return tm.selectOne(id);
    }
}
