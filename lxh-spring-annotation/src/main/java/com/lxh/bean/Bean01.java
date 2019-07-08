package com.lxh.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Bean01 implements InitializingBean ,DisposableBean
{
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
        System.out.println("Bean01.........执行构造器，创建完成");
    }

    @Override
    public void afterPropertiesSet() throws Exception
    {
        System.out.println("Bean01........实现InitializingBean,执行初始化方法：afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception
    {
        System.out.println("Bean01........实现DisposableBean,执行销毁方法：destroy");
    }
}
