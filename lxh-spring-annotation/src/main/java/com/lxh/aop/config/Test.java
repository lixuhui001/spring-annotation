package com.lxh.aop.config;

import com.lxh.aop.bean.MathCalculator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Auther: LiXuHui
 * @Date: 2019/7/9/009 19:15
 * @Description:
 */
public class Test
{
    static AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AopConfig.class);

    public static void main(String[] args)
    {
        MathCalculator mathCalculator = applicationContext.getBean(MathCalculator.class);
        mathCalculator.div(1, 2);
    }

}
