package com.lxh.properties_source.config;

import com.lxh.properties_source.bean.Bean10;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class Main2Test {

    static AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Properties_Source_Config.class);

    public static void main(String[] args) {

        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }
        System.out.println(applicationContext.getBean(Bean10.class));
        ConfigurableEnvironment configurableEnvironment = applicationContext.getEnvironment();
        System.out.println("获取配置文件中属性： name= " + configurableEnvironment.getProperty("name"));

        applicationContext.stop();
        System.out.println("IOC容器关闭-------------------------");
        applicationContext.close();
    }

}
