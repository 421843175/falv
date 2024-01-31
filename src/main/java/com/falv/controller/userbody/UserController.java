package com.falv.controller.userbody;

import com.falv.Utils.JUUpDownLoad;
import com.falv.service.UserService;
import com.falv.service.impl.ReUserServieImpl;
import com.falv.service.impl.UserTypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@RequestMapping("/body")
public class UserController {

    @Autowired
    private UserService us;

    @Autowired
    UserTypeServiceImpl uts;

    @Autowired
    ReUserServieImpl rsi;

    @RequestMapping("/message")
    public String info(String comments, HttpSession session,Model m){
        us.add(comments,session.getAttribute("username")+"");
        m.addAttribute("message","提交成功!");
        //如果你想要调用另一个requestMapping这里用重定向(但是会造成MODEL数据丢失)
        //可以用请求转发
        return "forward:/body/Evaluation";
    }

    @RequestMapping("/jingji")
    public String jingji(String info, Model m,HttpSession session)
    {
        uts.insert(session.getAttribute("username")+"","jingji",info);
        m.addAttribute("msg","提交成功");
        return "forward:/body/case/xingshi";
    }

    @RequestMapping("/mingshi")
    public String mingshi(String info, Model m,HttpSession session){
        uts.insert(session.getAttribute("username")+"","mingshi",info);
        m.addAttribute("msg","提交成功");
        return "forward:/body/case/mingshi";
    }

    @RequestMapping("/xingshi")
    public String xingshi(String info, Model m,HttpSession session){
        uts.insert(session.getAttribute("username")+"","xingshi",info);
        m.addAttribute("msg","提交成功");
        return "forward:/body/case/xingshi";
    }

    @PutMapping("/reuser")
    //file是name的值
    public String reuser(String info, String type, HttpSession session, MultipartFile userfile, Model m) throws IOException {
        System.out.println(session.getAttribute("username")+""+type+":"+info+":"+ !userfile.isEmpty());
        rsi.userinsert(session.getAttribute("username")+"",type,info, !userfile.isEmpty());
        if(!userfile.isEmpty())
            JUUpDownLoad.toUpload(userfile,session,"",session.getAttribute("username")+"");
        m.addAttribute("msg","成功!");
        return "forward:/body/info";
    }


}
