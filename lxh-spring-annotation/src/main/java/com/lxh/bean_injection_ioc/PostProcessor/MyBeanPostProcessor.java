package com.lxh.bean_injection_ioc.PostProcessor;

import com.lxh.bean_injection_ioc.bean.Bean07;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * 后置处理器：初始化前后进行处理工作
 * 将后置处理器加入到容器中
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor
{

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException
    {
        // TODO Auto-generated method stub
        System.out.println("postProcessBeforeInitialization..." + beanName + "=>" + bean);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException
    {
        // TODO Auto-generated method stub
        System.out.println("postProcessAfterInitialization..." + beanName + "=>" + bean);
        if (beanName.equals("bean07"))
        {
            ((Bean07) bean).setName("被后置处理过bean07");
        }
        return bean;
    }

}
