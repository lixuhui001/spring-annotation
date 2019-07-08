package com.lxh.main;

import com.lxh.config.Main1Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main1Test
{

	static AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main1Config.class);

	public static void main(String[] args) {

		String[] definitionNames = applicationContext.getBeanDefinitionNames();
		for (String name : definitionNames) {
			System.out.println(name);
		}
		System.out.println(applicationContext.getBean("bean07"));
//		System.out.println(applicationContext.getBean("bean4FactoryBean"));
//		System.out.println(applicationContext.getBean("&bean4FactoryBean"));
		applicationContext.stop();


		System.out.println("IOC容器关闭-------------------------");

		applicationContext.close();
	}

}
