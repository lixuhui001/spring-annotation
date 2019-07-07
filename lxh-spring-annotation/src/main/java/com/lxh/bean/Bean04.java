package com.lxh.bean;

public class Bean04 {
    private  String  name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bean04{" +
                "name='" + name + '\'' +
                '}';
    }

    public Bean04(String name) {
        this.name = name;
    }

    public Bean04() {
    }
}
