package com.lxh.tx.dao.product;

import com.lxh.tx.bean.Product;
import com.lxh.tx.bean.ProductExample;
import com.lxh.tx.bean.ProductKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
*@author Robot
*/
public interface ProductGeneratorMapper
{

	public Integer countByExample(ProductExample entity);

    public List<Product> selectByExample(ProductExample entity);

	public Product selectByPrimaryKey(ProductKey key);

	public Product selectUnDelByPrimaryKey(ProductKey key);

    public Integer insertSelective(Product entity);

	public Integer replaceSelective(Product entity);
 
    public Integer deleteByExample(ProductExample example);

	public Integer deleteByPrimaryKey(ProductKey key);

    public Integer updateAllByExample(@Param("record") Product entity, @Param("example") ProductExample example);

	public Integer updateByPrimaryKeySelective(Product entity);

}