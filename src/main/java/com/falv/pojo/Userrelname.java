package com.falv.pojo;


public class Userrelname {
    private String username;

    public Userrelname(String username) {
        this.username = username;
    }

    private String relname;

    private String nick;

    private Integer sex;

    private String birth;

    private String info;

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "Userrelname{" +
                "username='" + username + '\'' +
                ", relname='" + relname + '\'' +
                ", nick='" + nick + '\'' +
                ", sex='" + sex + '\'' +
                ", birth='" + birth + '\'' +
                ", info='" + info + '\'' +
                '}';
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getRelname() {
        return relname;
    }

    public void setRelname(String relname) {
        this.relname = relname == null ? null : relname.trim();
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick == null ? null : nick.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex == null ? null : sex;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth == null ? null : birth.trim();
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }
}