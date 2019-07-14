/*
package com.lxh.tx.config;

import com.alibaba.druid.pool.xa.DruidXADataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

*/
/**
 * @Auther: LiXuHui
 * @Date: 2019/4/15/015 11:39
 * @Description:
 *//*

@Configuration
@MapperScan(basePackages = "com.home.dao.bill", sqlSessionFactoryRef = "billSqlSessionFactory")
public class DataSourceConfigBill {

    @Value("${master.url}")
    private String url;
    @Value("${master.username}")
    private String username;
    @Value("${master.password}")
    private String password;

    @Bean(name = "billDataSource")
//    @ConfigurationProperties(prefix = "bill.read")
    public DataSource getDateSource2() {
        DruidXADataSource druidXADataSource = new DruidXADataSource();
        // 数据库驱动
        // 相应驱动的jdbcUrl
        System.out.println(url);
        druidXADataSource.setUrl(url);
        // 数据库的用户名
        druidXADataSource.setUsername(username);
        // 数据库的密码
        druidXADataSource.setPassword(password);

        */
/*druidXADataSource.setMaxActive(maxActive);
        druidXADataSource.setInitialSize(initialSize);
        druidXADataSource.setMaxWait(maxWait);
        druidXADataSource.setMinIdle(minIdle);
        druidXADataSource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
        druidXADataSource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
        druidXADataSource.setValidationQuery(validationQuery);
        druidXADataSource.setTestWhileIdle(testWhileIdle);
        druidXADataSource.setTestOnBorrow(testOnBorrow);
        druidXADataSource.setTestOnReturn(testOnReturn);
        druidXADataSource.setPoolPreparedStatements(poolPreparedStatements);
        druidXADataSource.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize);*//*


        return druidXADataSource;
    }

    @Bean(name = "billSqlSessionFactory")
    public SqlSessionFactory test2SqlSessionFactory(@Qualifier("billDataSource") DataSource datasource)
            throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(datasource);
        bean.setMapperLocations(
                new PathMatchingResourcePatternResolver().getResources("classpath*:mappings/bill/*.xml"));

        return bean.getObject();
    }

    @Bean("billSqlSessionTemplate")
    public SqlSessionTemplate test2sqlsessiontemplate(
            @Qualifier("billSqlSessionFactory") SqlSessionFactory sessionfactory) {
        return new SqlSessionTemplate(sessionfactory);
    }

    @Bean(name = "masterMapperScannerConfig")
    public MapperScannerConfigurer mapperScannerConfigurer()
    {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("billSqlSessionFactory");
        mapperScannerConfigurer.setBasePackage("com.gooagoo.vat.dao.*");
        return mapperScannerConfigurer;
    }
}

*/
