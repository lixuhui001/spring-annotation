package com.lxh.bean_injection_ioc.config;

import com.lxh.controller.BookController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    static AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Bean_injection_ioc_Config.class);

    public static void main(String[] args) {

        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }







        applicationContext.stop();
        System.out.println("IOC容器关闭-------------------------");
        applicationContext.close();
    }
}
