package com.lxh.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Bean06
{
    private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }


    @PostConstruct
    public void init()
    {
        System.out.println("Bean06........,执行 @PostConstruct初始化方法：init...");
    }

    @PreDestroy
    public void detory()
    {
        System.out.println("Bean06........,执行 @PreDestroy销毁方法：detory...");
    }


    @Override
    public String toString()
    {
        return "Bean06{" +
                "name='" + name + '\'' +
                '}';
    }

    public Bean06(String name)
    {
        this.name = name;
    }

    public Bean06()
    {
        System.out.println("Bean06.........执行构造器，创建完成");
    }


}
