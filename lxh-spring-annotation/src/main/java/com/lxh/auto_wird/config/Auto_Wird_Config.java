package com.lxh.auto_wird.config;

import com.lxh.auto_wird.bean.Bean20;
import com.lxh.auto_wird.bean.Bean22;
import com.lxh.properties_source.bean.Bean10;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;


@Configuration
@ComponentScan("com.lxh.auto_wird")
public class Auto_Wird_Config {


    @Primary
    @Bean(value = "bean20A")
    public Bean20 Bean20A() {
        Bean20 bean20=new Bean20();
        bean20.setId("bean20A");
        return  bean20;
    }
    @Bean(value = "bean20B")
    public Bean20 Bean20B() {
        Bean20 bean20=new Bean20();
        bean20.setId("bean20B");
        return  bean20;
    }

    @Bean(value = "bean22")
    public Bean22 Bean22(@Qualifier(value = "bean20B") Bean20 bean20) {
        Bean22 bean22=new Bean22(bean20);
        return  bean22;
    }
}
