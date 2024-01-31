package com.falv.controller;

import com.falv.mapper.UserinfoMapper;
import com.falv.pojo.Userinfo;
import com.falv.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @Autowired
    private TestService tm;

    @Autowired
    private UserinfoMapper userinfoMapper;

    @RequestMapping("/test/testUserMap")
    public String testUserMap(){

        System.out.println("他是:"+userinfoMapper.selectByPrimaryKey(1));
        return "index";

    }


    @RequestMapping("/test/map")
    public String testMap(){

        System.out.println("他是:"+tm.get(7));
        return "index";

    }
}
