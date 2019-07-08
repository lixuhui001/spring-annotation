package com.lxh.bean;

import org.springframework.beans.factory.FactoryBean;


//创建一个Spring定义的FactoryBean
public class Bean4FactoryBean implements FactoryBean<Bean04> {

    //返回一个Color对象，这个对象会添加到容器中
    @Override
    public Bean04 getObject() throws Exception {
        // TODO Auto-generated method stub
        System.out.println("Bean04已被添加到容器中");
        return new Bean04();
    }

    @Override
    public Class<?> getObjectType() {
        // TODO Auto-generated method stub
        return Bean04.class;
    }

    //是否单例
    @Override
    public boolean isSingleton() {
        // TODO Auto-generated method stub
        return false;
    }

}

