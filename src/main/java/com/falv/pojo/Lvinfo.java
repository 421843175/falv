package com.falv.pojo;

public class Lvinfo {


    private Integer id;

    private String name;

    private Integer age;

    private String info;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    @Override
    public String toString() {
        return "Lvinfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", info='" + info + '\'' +
                '}';
    }
}