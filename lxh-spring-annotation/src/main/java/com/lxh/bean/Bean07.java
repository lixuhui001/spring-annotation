package com.lxh.bean;

public class Bean07
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


    public void init()
    {
        System.out.println("Bean07........,执行指定init：init...");
    }

    public void detory()
    {
        System.out.println("Bean07........,执行指定detory：detory...");
    }


    @Override
    public String toString()
    {
        return "Bean07{" +
                "name='" + name + '\'' +
                '}';
    }

    public Bean07(String name)
    {
        this.name = name;
    }

    public Bean07()
    {
        System.out.println("Bean07.........执行构造器，创建完成");
    }


}
