package com.falv.controller.userbody;

import com.falv.pojo.Userread;
import com.falv.pojo.Userrelname;
import com.falv.pojo.Usertable;
import com.falv.service.UserReadService;
import com.falv.service.UserinfoService;
import com.falv.service.UserrelnameService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import javax.websocket.server.PathParam;

@Controller
@RequestMapping("/body")
public class UserInfoController {
    @Autowired
    UserrelnameService uts;

    @Autowired
    UserinfoService uis;

    @Autowired
    UserReadService urs;

    //前往收件箱
    @RequestMapping("people/getinfo")
    public String to_body_people_getinfo(HttpSession session,Model m){
        m.addAttribute("userread",urs.selectOne(session.getAttribute("username")+""));
        m.addAttribute("userreadcount",urs.count(session.getAttribute("username")+""));
        System.out.println(urs.selectOne(session.getAttribute("username")+""));
        return "/body/people/getinfo";
    }

//设置为已读
    @RequestMapping("people/du")
    public String people_people_du(Integer id){
        urs.updateSetRead(id);
        return "forward:/body/people/getinfo";

    }


    @RequestMapping("people/setpassword")
    public String to_body_people_setpassword(){
        return "/body/people/setpassword";
    }

    @RequestMapping("people/setpasswordpost")
    public String people_setpassword(HttpSession session, String oldpwd, String newpwd1, String newpwd2, Model m){
        if (!uis.boolPassword(session.getAttribute("username")+"",oldpwd)) {
            m.addAttribute("msg","与原密码不相符!");
            return "forward:/body/people/setpassword";
        }
        if(uis.xiu(session.getAttribute("username")+"",newpwd1,newpwd2)==1){
            m.addAttribute("msg","两次密码不一致!");
        }else{
            m.addAttribute("msg","修改成功!");
        }

        return "forward:/body/people/setpassword";
    }

    @RequestMapping("people/setPersonal")
    //设置个人信息
    public String to_body_people_setPersonal(HttpSession session,Model m){
        Userrelname user = uts.select(new Userrelname(session.getAttribute("username")+""));

        if(user!=null)
            m.addAttribute("user",user);
        System.out.println("user="+user);
        return "/body/people/setPersonal";
    }

    @RequestMapping("people/postsetPersonal")
    public String people_setpostPersonal(Userrelname u, Model m, HttpSession session){
        u.setUsername(session.getAttribute("username")+"");
        uts.updateUser(u);
        m.addAttribute("msg","更新成功");
        return "forward:/body/people/setPersonal";

    }






}
