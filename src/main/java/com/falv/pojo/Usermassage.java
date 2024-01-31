package com.falv.pojo;

public class Usermassage {
    private String username;

    private String message;

    private String date;

    public Usermassage(String username, String message, String date) {
        this.username = username;
        this.message = message;
        this.date = date;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }
}