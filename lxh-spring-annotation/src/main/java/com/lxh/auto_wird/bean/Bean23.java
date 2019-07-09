package com.lxh.auto_wird.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Bean23
{


    Bean20 bean20;

    @Autowired
    public Bean23(@Qualifier(value = "bean20B")Bean20 bean20)
    {
        System.out.println("Bean23.........执行有参构造器，创建完成bean20=" + bean20);
        this.bean20 = bean20;
    }


    @Override
    public String toString()
    {
        return "Bean23{" +
                "bean20=" + bean20 +
                '}';
    }

    public Bean23()
    {
        System.out.println("Bean23.........执行无参构造器，创建完成");
    }

}
