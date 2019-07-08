package com.lxh.bean_injection_ioc.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Bean02 implements InitializingBean, DisposableBean {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Bean02(String id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Bean02{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Bean02() {
        System.out.println("Bean02执行构造器，创建完成");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean02........实现InitializingBean,执行初始化方法：afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean02........实现DisposableBean,执行销毁方法：destroy");
    }
}
