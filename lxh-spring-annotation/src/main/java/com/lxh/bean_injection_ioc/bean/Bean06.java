package com.lxh.bean_injection_ioc.bean;

public class Bean06 {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public Bean06(String id, String name) {
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
        return "Bean06{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Bean06() {
        System.out.println("Bean06.........执行构造器，创建完成");
    }

}
