package com.falv.pojo;

public class Userread {

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private String user;

    private String title;

    private String body;

    private Boolean read;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body == null ? null : body.trim();
    }

    public Boolean getRead() {
        return read;
    }

    public void setRead(Boolean read) {
        this.read = read;
    }

    @Override
    public String toString() {
        return "Userread{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", read=" + read +
                '}';
    }
}