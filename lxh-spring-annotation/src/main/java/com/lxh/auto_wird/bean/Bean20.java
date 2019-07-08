package com.lxh.auto_wird.bean;

public class Bean20 {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public Bean20(String id, String name) {
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
        return "Bean20{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Bean20() {
        System.out.println("Bean20.........执行构造器，创建完成");
    }

}
