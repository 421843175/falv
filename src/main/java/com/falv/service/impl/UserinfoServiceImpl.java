package com.falv.service.impl;

import com.falv.Utils.Md5Tool;
import com.falv.mapper.UserinfoMapper;
import com.falv.pojo.Userinfo;
import com.falv.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserinfoServiceImpl implements UserinfoService {

    @Autowired
    private UserinfoMapper userinfoMapper;

        public Userinfo login(String username,String password){
            Userinfo userinfo = userinfoMapper.selectByUsername(username);
//            System.out.println("getmd5"+userinfo.getPassword());
//            System.out.println("youmd5:"+Md5Tool.getDoubleMd5(password));
            if(userinfo==null)
                return null;
            if(userinfo.getPassword().equals(Md5Tool.getDoubleMd5(password))){
                return userinfo;
            }
            return null;
        }

        //与原密码相符吗
        public boolean boolPassword(String username,String pass1){
            return Md5Tool.getDoubleMd5(pass1).equals(userinfoMapper.selectByUsername(username).getPassword())?true:false;
        }

    @Override
    public int register(Userinfo userinfo) {
            if(userinfoMapper.selectByUsername(userinfo.getUsername())!=null)
                return 1;//账户已经存在
        userinfo.setPassword(Md5Tool.getDoubleMd5(userinfo.getPassword()));
            userinfo.setPower(0);
            userinfoMapper.insert(userinfo);
            return 0;//正常返回

    }

    //修密码
    public int xiu(String username,String pwd1,String pwd2)
    {
    if(!pwd1.equals(pwd2))
    {
        return 1;  //两次密码不一致
    }
    userinfoMapper.updatepassword(Md5Tool.getDoubleMd5(pwd1),username);
    return 0;  //修改成功
    }

}
