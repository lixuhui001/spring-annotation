package com.lxh.auto_wird.config;

import com.lxh.auto_wird.bean.*;
import com.lxh.properties_source.bean.Bean10;
import com.lxh.properties_source.config.Properties_Source_Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class Test {

    static AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Auto_Wird_Config.class);

    public static void main(String[] args) {

        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }
        System.out.println(applicationContext.getBean(Bean21.class));
        System.out.println(applicationContext.getBean(Bean22.class));
        System.out.println(applicationContext.getBean(Bean23.class));
        System.out.println(applicationContext.getBean(Bean24.class));
        System.out.println(applicationContext.getBean(Bean25.class));


        applicationContext.stop();
        System.out.println("IOC容器关闭-------------------------");
        applicationContext.close();
    }

}
