package com.lxh.tx.service;

import com.lxh.tx.bean.Product;
import com.lxh.tx.dao.product.ProductGeneratorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {

    @Autowired
    ProductGeneratorMapper productGeneratorMapper;

//    @Transactional
    public void add() {
        Product product = new Product();
        product.setPid("12");
        product.setProductName("12");
        product.setDbSource("12");
        productGeneratorMapper.insertSelective(product);
        System.out.println("插入成功");
        int i = 1 / 0;
    }

}
