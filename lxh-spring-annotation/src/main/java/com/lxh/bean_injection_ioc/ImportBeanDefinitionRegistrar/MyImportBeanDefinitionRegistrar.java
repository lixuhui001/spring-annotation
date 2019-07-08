package com.lxh.bean_injection_ioc.ImportBeanDefinitionRegistrar;

import com.lxh.bean_injection_ioc.bean.Bean04;
import com.lxh.bean_injection_ioc.bean.Bean06;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Auther: LiXuHui
 * @Date: 2019/7/8/008 11:26
 * @Description:
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar
{
    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry)
    {
        boolean definition = beanDefinitionRegistry.containsBeanDefinition(Bean04.class.getName());
        if (definition)
        {

            // 指定Bean定义信息；（Bean的类型，Bean。。。）
            RootBeanDefinition beanDefinition = new RootBeanDefinition(Bean06.class);
            // 注册一个Bean，指定bean名
            beanDefinitionRegistry.registerBeanDefinition("bean06", beanDefinition);
        }
    }
}
