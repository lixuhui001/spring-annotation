package com.lxh.event.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    static AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ExtConfig.class);

    public static void main(String[] args) {

//        String[] definitionNames = applicationContext.getBeanDefinitionNames();
//        for (String name : definitionNames) {
//            System.out.println(name);
//        }







        applicationContext.stop();
        System.out.println("IOC容器关闭-------------------------");
        applicationContext.close();
    }
}
