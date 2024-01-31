package com.falv;

import lombok.SneakyThrows;
import org.springframework.util.DigestUtils;

public class md5Test {
    @SneakyThrows
    public static void main(String[] args) {
        String str="addd";
        String md5str = DigestUtils.md5DigestAsHex(str.getBytes("utf-8"));
        md5str = DigestUtils.md5DigestAsHex(md5str.getBytes("utf-8"));
        System.out.println(md5str);
    }

}
