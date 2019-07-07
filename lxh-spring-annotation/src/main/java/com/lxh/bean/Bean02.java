package com.lxh.bean;

public class Bean02 {
    private  String  name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bean02{" +
                "name='" + name + '\'' +
                '}';
    }

    public Bean02(String name) {
        this.name = name;
    }

    public Bean02() {
    }
}
