package com.lxh.bean_injection_ioc.bean;

public class Bean08 {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public Bean08(String id, String name) {
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
        return "Bean08{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Bean08() {
        System.out.println("Bean08.........执行构造器，创建完成");
    }

}
