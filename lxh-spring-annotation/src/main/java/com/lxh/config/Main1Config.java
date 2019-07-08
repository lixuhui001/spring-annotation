package com.lxh.config;

import com.lxh.Conditional.MyImportBeanDefinitionRegistrar;
import com.lxh.Conditional.MyImportSelector;
import com.lxh.Conditional.WindowsCondition;
import com.lxh.bean.*;
import com.lxh.service.BookService;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

//配置类
//标注为spring这是一个配置类
@Configuration
//类中组件统一设置。满足当前条件，这个类中配置的所有bean注册才能生效；如出现在方法上则满足条件给容器中注册bean
@Conditional({WindowsCondition.class})
/**指定要扫描的包
 * 扫描目标为路径条件下（@Controller/@Service/@Repository/@Component）[自己写的类]
 * excludeFilters = Filter[] ：指定扫描的时候按照什么规则排除那些组件
 * includeFilters = Filter[] ：指定扫描的时候只需要包含哪些组件
 * FilterType.ANNOTATION：按照注解
 * FilterType.ASSIGNABLE_TYPE：按照给定的类型；
 * FilterType.ASPECTJ：使用ASPECTJ表达式
 * FilterType.REGEX：使用正则指定
 * ilterType.CUSTOM：使用自定义规则，实现TypeFilter接口作为规则
 * */
@ComponentScan()
/**指定多个扫描规则*/
@ComponentScans(
        value = {
                @ComponentScan(value = "com.lxh", includeFilters = {
                        @Filter(type = FilterType.ANNOTATION, classes = {Controller.class, Component.class}),
                        @Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {BookService.class}),
//                        @Filter(type = FilterType.CUSTOM, classes = {MyTypeFilter.class})
                }, useDefaultFilters = false)
        }
)
/**
 * @Import[快速给容器中导入一个组件]
 * 		1）、@Import(要导入到容器中的组件)；容器中就会自动注册这个组件，id默认是全类名
 * 		2）、ImportSelector:返回需要导入的组件的全类名数组；
 * 		3）、ImportBeanDefinitionRegistrar:手动注册bean到容器中
 */
@Import({Bean02.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
public class Main1Config
{

    /**
     * Scope属性：
     * prototype：多实例的：ioc容器启动并不会去调用方法创建对象放在容器中。 每次获取的时候才会调用方法创建对象；容器不会管理这个bean；容器不会调用销毁方法；
     * singleton：单实例的（默认值）：ioc容器启动会调用方法创建对象放到ioc容器中。以后每次获取就是直接从容器（map.get()）中拿，容器关闭的时候进行销毁
     * request：同一次请求创建一个实例
     * session：同一个session创建一个实例
     */
    @Scope("singleton")
    /**
     * @Lazy 懒加载：
     * 单实例bean：默认在容器启动的时候创建对象
     * 懒加载：容器启动不创建对象。第一次使用(获取)Bean创建对象，并初始化
     * */
//    @Lazy
    /**
     * value：指定名称
     *
     * bean的生命周期：bean创建---初始化----销毁的过程
     * 容器管理bean的生命周期；
     * 我们可以自定义初始化和销毁方法；容器在bean进行到当前生命周期的时候来调用我们自定义的初始化和销毁方法
     * 初始化方法在实例创建完成后并所有属性都已赋初始值之后执行
     * 单例模式时bean在容器关闭(applicationContext.close())的时候进行销毁，多实例时则容器不会管理这个bean，即容器不会调用销毁方法
     * 指定初始化方法和小会方法
     *      1.initMethod：指定初始化方法，destroyMethod：指定销毁方法
     *      2.Bean实现InitializingBean（定义初始化逻辑），DisposableBean（定义销毁逻辑）;
     *      3.可以使用JSR250注解，@PostConstruct：在bean创建完成并且属性赋值完成；来执行初始化方法，@PreDestroy：在容器销毁bean之前通知我们进行清理工作
     *
     * */
    @Bean(value = "bean01"/*, initMethod = "init", destroyMethod = "detory"*/)
    public Bean01 bean01()
    {
        return new Bean01("bean01");
    }

    /*JSR250注解定义初始化及销毁方法*/
    @Bean(value = "bean06")
    public Bean06 bean06()
    {
        return new Bean06("bean06");
    }

    /**
     * BeanPostProcessor : bean的后置处理器；
     * 在bean的初始化前后进行回调操作
     * postProcessBeforeInitialization方法:在初始化之前工作
     * postProcessAfterInitialization方法:在初始化之后工作
     */
    @Bean(value = "bean07", initMethod = "init", destroyMethod = "detory")
    public Bean07 bean07()
    {
        return new Bean07("bean07");
    }

    /**
     * 使用Spring提供的 FactoryBean（工厂Bean）;
     * 1）、默认获取到的是工厂bean调用getObject创建的对象
     * 2）、要获取工厂Bean本身，我们需要给id前面加一个&,&bean4FactoryBean
     */
    @Bean
    public Bean4FactoryBean bean4FactoryBean()
    {
        return new Bean4FactoryBean();
    }

}
