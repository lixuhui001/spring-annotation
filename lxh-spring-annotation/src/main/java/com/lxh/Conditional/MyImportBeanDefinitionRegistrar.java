package com.lxh.Conditional;

import com.lxh.bean.Bean02;
import com.lxh.bean.Bean03;
import com.lxh.bean.Bean05;
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
        boolean definition = beanDefinitionRegistry.containsBeanDefinition(Bean03.class.getName());
        boolean definition2 = beanDefinitionRegistry.containsBeanDefinition(Bean02.class.getName());
        if (definition && definition2)
        {

            // 指定Bean定义信息；（Bean的类型，Bean。。。）
            RootBeanDefinition beanDefinition = new RootBeanDefinition(Bean05.class);
            // 注册一个Bean，指定bean名
            beanDefinitionRegistry.registerBeanDefinition("bean05", beanDefinition);
        }
    }
}
