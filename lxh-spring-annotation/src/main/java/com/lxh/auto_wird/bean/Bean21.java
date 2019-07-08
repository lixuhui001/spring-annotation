package com.lxh.auto_wird.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Bean21 {

    @Qualifier(value = "bean20B")
    @Autowired
    Bean20 bean20;

    @Override
    public String toString() {
        return "Bean21{" +
                "bean20=" + bean20 +
                '}';
    }

    public Bean21() {
        System.out.println("Bean21.........执行构造器，创建完成");
    }

}
