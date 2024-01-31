package com.falv.pojo;

public class Reuser {
    private String username;

    private String type;

    private String info;

    //tinyint(1)自动转换boolean
    private Boolean file;

    public Reuser(String username, String type, String info, Boolean file) {
        this.username = username;
        this.type = type;
        this.info = info;
        this.file = file;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    public Boolean getFile() {
        return file;
    }

    public void setFile(Boolean file) {
        this.file = file;
    }
}