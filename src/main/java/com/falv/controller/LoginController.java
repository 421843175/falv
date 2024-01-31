package com.falv.controller;

import com.falv.pojo.Userinfo;
import com.falv.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Autowired
    private UserinfoService ls;

    @RequestMapping("/tologin")
    public String toLogin(String username, String password, Model m, HttpSession session){
        Userinfo user = ls.login(username, password);
        if(user==null)
        {
            m.addAttribute("msg","对不起，您的账户不存在或密码错误");
            return "index";
        }

        else
        {
            session.setAttribute("username",user.getUsername());
            session.setAttribute("power",user.getPower());
            System.out.println("user.getPower()="+user.getPower());

            if(user.getPower()==0)
                //config类要绑定
                return "redirect:/body/index";
            else if(user.getPower()==1)
                return "redirect:/console/index";
            
        }
        return "index";


    }

    @RequestMapping("/register")
    public String toregister(String username,String pass1,String pass2,Model m,HttpSession session){
        if(!ls.boolPassword(pass1,pass2))
        {
            m.addAttribute("msg","对不起，您两次输入的密码不一致，请重试");
            return "re";
        }
        int statusRe = ls.register(new Userinfo(username, pass1));
        if(statusRe==1){
            m.addAttribute("msg","对不起，账户已经存在，请登录");
            return "re";
        }
        else if(statusRe==0){
            session.setAttribute("username",username);
            session.setAttribute("power",0);
            return "redirect:/body/index";
        }else{
            m.addAttribute("msg","未知错误!");
            return "re";
        }
    }
}
