package com.lxh.bean;

public class Bean03 {
    private  String  name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bean03{" +
                "name='" + name + '\'' +
                '}';
    }

    public Bean03(String name) {
        this.name = name;
    }

    public Bean03() {
    }
}
