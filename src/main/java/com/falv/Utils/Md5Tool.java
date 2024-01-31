package com.falv.Utils;

import org.springframework.util.DigestUtils;

import java.io.UnsupportedEncodingException;

public class Md5Tool {
    public static String getDoubleMd5(String str){
        String md5str="";
        try {
             md5str = DigestUtils.md5DigestAsHex(str.getBytes("utf-8"));
            md5str = DigestUtils.md5DigestAsHex(md5str.getBytes("utf-8"));

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return md5str;
    }
}
