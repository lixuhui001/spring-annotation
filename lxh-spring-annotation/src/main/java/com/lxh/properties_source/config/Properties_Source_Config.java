package com.lxh.properties_source.config;

import com.lxh.properties_source.bean.Bean10;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan("com.lxh.properties_source")
//使用@PropertySource读取外部配置文件中的k/v保存到运行的环境变量中;加载完外部的配置文件以后使用${}取出配置文件的值
@PropertySource(value = {"classpath:/source.properties"})
public class Properties_Source_Config
{
    @Value("1")
    private String id;
    @Value("#{1+2}")
    private String age;
    @Value("${name}")
    private String name;

    @Bean
    public Bean10 Bean10(){
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
         return  new Bean10();
    }
}
