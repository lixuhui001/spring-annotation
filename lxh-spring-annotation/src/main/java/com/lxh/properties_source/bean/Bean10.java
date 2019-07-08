package com.lxh.properties_source.bean;

import org.springframework.beans.factory.annotation.Value;

public class Bean10
{
    //使用@Value赋值；
    //1、基本数值
    //2、可以写SpEL； #{}
    //3、可以写${}；取出配置文件【properties】中的值（在运行环境变量里面的值）
    @Value("1")
    private String id;
    @Value("#{1+2}")
    private String age;
    @Value("${name}")
    private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }


    public void init()
    {
        System.out.println("Bean08........,执行指定init：init...");
    }

    public void detory()
    {
        System.out.println("Bean08........,执行指定detory：detory...");
    }




    public Bean10(String name)
    {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bean10{" +
                "id='" + id + '\'' +
                ", age='" + age + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Bean10()
    {
        System.out.println("Bean10.........执行构造器，创建完成");
    }


}
