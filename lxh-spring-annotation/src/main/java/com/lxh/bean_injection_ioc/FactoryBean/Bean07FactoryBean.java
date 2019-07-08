package com.lxh.bean_injection_ioc.FactoryBean;

import com.lxh.bean_injection_ioc.bean.Bean07;
import org.springframework.beans.factory.FactoryBean;


//创建一个Spring定义的FactoryBean
public class Bean07FactoryBean implements FactoryBean<Bean07> {

    //返回一个Color对象，这个对象会添加到容器中
    @Override
    public Bean07 getObject() throws Exception {
        // TODO Auto-generated method stub
        return new Bean07();
    }

    @Override
    public Class<?> getObjectType() {
        // TODO Auto-generated method stub
        return Bean07.class;
    }

    //是否单例
    @Override
    public boolean isSingleton() {
        // TODO Auto-generated method stub
        return true;
    }

}

