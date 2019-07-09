package com.lxh.auto_wird.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bean24
{


    Bean20 bean20;

    public Bean24(Bean20 bean20)
    {
        System.out.println("Bean24.........执行有参构造器，创建完成bean20=" + bean20);
        this.bean20 = bean20;
    }


    @Override
    public String toString()
    {
        return "Bean22{" +
                "bean20=" + bean20 +
                '}';
    }


}
