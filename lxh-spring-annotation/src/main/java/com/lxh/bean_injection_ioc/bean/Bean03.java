package com.lxh.bean_injection_ioc.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Bean03 {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public Bean03(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void init() {
        System.out.println("Bean03........,执行 @PostConstruct初始化方法：init...");
    }

    @PreDestroy
    public void detory() {
        System.out.println("Bean03........,执行 @PreDestroy销毁方法：detory...");
    }


    @Override
    public String toString() {
        return "Bean03{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Bean03() {
        System.out.println("Bean03.........执行构造器，创建完成");
    }

}
