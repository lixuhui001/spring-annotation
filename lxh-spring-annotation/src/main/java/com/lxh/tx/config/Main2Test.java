package com.lxh.tx.config;

import com.lxh.properties_source.bean.Bean10;
import com.lxh.properties_source.config.Properties_Source_Config;
import com.lxh.tx.bean.Product;
import com.lxh.tx.bean.ProductExample;
import com.lxh.tx.dao.product.ProductGeneratorMapper;
import com.lxh.tx.service.ProductService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.List;

public class Main2Test {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TxConfig.class);


        ProductGeneratorMapper productGeneratorMapper = applicationContext.getBean(ProductGeneratorMapper.class);
        System.out.println(productGeneratorMapper);
        List<Product> products = productGeneratorMapper.selectByExample(new ProductExample());
        System.out.println("products" + products);

        ProductService productService = applicationContext.getBean(ProductService.class);
        productService.add();

        applicationContext.stop();
        System.out.println("IOC容器关闭-------------------------");
        applicationContext.close();
    }

}
