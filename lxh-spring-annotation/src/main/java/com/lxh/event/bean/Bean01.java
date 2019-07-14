package com.lxh.event.bean;

public class Bean01 {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public Bean01(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Bean01{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }


    public void init() {
        System.out.println("Bean01 ... init...");
    }

    public void detory() {
        System.out.println("Bean01 ... detory...");
    }

    public Bean01() {
        System.out.println("Bean01.........执行构造器，创建完成");
    }

}
