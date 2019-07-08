package com.lxh.bean;

public class Bean05
{
    private  String  name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bean05{" +
                "name='" + name + '\'' +
                '}';
    }

    public Bean05(String name) {
        this.name = name;
    }

    public Bean05() {
    }
}
