package com.lxh.bean;

public class Bean01 {
    private  String  name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void init(){
        System.out.println("Bean01 ... init...");
    }

    public void detory(){
        System.out.println("Bean01 ... detory...");
    }


    @Override
    public String toString() {
        return "Bean01{" +
                "name='" + name + '\'' +
                '}';
    }

    public Bean01(String name) {
        this.name = name;
    }

    public Bean01() {

    }
}
