package com.falv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/body")
public class BodyController {


    @RequestMapping("/Notice")
    public String toNotice(){
        return "/body/Notice/index";
    }

    @RequestMapping("/Evaluation")
    public String toEvaluation(){
        return "/body/Evaluation/index";
    }

    @RequestMapping("/appointment")
    public String toappointment(){
        return "/body/appointment/index";
    }

    @RequestMapping("/case/xingshi")
    public String tocase_xingshi(){
        return "/body/case/xingshi";
    }

    @RequestMapping("/case/mingshi")
    public String tocase_mingshi(){
        return "/body/case/mingshi";
    }

    @RequestMapping("/case/jingji")
    public String tocase_jingji(){
        return "/body/case/jingji";
    }

    @RequestMapping("/info")
    public String toinfo(){
        return "/body/info/index";
    }




}
