package com.lxh.tx.config;

import com.alibaba.druid.pool.xa.DruidXADataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/**
 * @Auther: LiXuHui
 * @Date: 2019/4/15/015 11:39
 * @Description:
 */
@Configuration
@MapperScan(basePackages = "com.lxh.tx.dao.product", sqlSessionFactoryRef = "productSqlSessionFactory")
public class DataSourceConfigProduct {

//    @Value("${master.url}")
//    private String url;
//    @Value("${master.username}")
//    private String username;
//    @Value("${master.password}")
//    private String password;
//
////    @Value("${bill.read.maxActive}")
////    private Integer maxActive;
////    @Value("${bill.read.initialSize}")
////    private Integer initialSize;
////    @Value("${bill.read.maxWait}")
////    private Integer maxWait;
////    @Value("${bill.read.minIdle}")
////    private Integer minIdle;
////    @Value("${bill.read.timeBetweenEvictionRunsMillis}")
////    private Integer timeBetweenEvictionRunsMillis;
////    @Value("${bill.read.minEvictableIdleTimeMillis}")
////    private Integer minEvictableIdleTimeMillis;
////    @Value("${bill.read.validationQuery}")
////    private String validationQuery;
////    @Value("${bill.read.testWhileIdle}")
////    private boolean testWhileIdle;
////    @Value("${bill.read.testOnBorrow}")
////    private boolean testOnBorrow;
////    @Value("${bill.read.testOnReturn}")
////    private boolean testOnReturn;
////    @Value("${bill.read.poolPreparedStatements}")
////    private boolean poolPreparedStatements;
////    @Value("${bill.read.maxPoolPreparedStatementPerConnectionSize}")
////    private Integer maxPoolPreparedStatementPerConnectionSize;
//
//    @Bean(name = "productDataSource")
////    @ConfigurationProperties(prefix = "bill.read")
//    public DataSource getDateSource2() {
//        DruidXADataSource druidXADataSource = new DruidXADataSource();
//        // 数据库驱动
//        // 相应驱动的jdbcUrl
//        System.out.println(url);
//        druidXADataSource.setUrl(url);
//        // 数据库的用户名
//        druidXADataSource.setUsername(username);
//        // 数据库的密码
//        druidXADataSource.setPassword(password);
//
// //       druidXADataSource.setMaxActive(maxActive);
//
////        druidXADataSource.setInitialSize(initialSize);
////
////        druidXADataSource.setMaxWait(maxWait);
////        druidXADataSource.setMinIdle(minIdle);
////        druidXADataSource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
////
////        druidXADataSource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
////        druidXADataSource.setValidationQuery(validationQuery);
////        druidXADataSource.setTestWhileIdle(testWhileIdle);
////        druidXADataSource.setTestOnBorrow(testOnBorrow);
////        druidXADataSource.setTestOnReturn(testOnReturn);
////        druidXADataSource.setPoolPreparedStatements(poolPreparedStatements);
////        druidXADataSource.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize);
//
//        return druidXADataSource;
//    }
//
//    @Bean(name = "productSqlSessionFactory")
//    public SqlSessionFactory test2SqlSessionFactory(@Qualifier("productDataSource") DataSource datasource)
//            throws Exception {
//        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//        bean.setDataSource(datasource);
//        bean.setMapperLocations(
//                new PathMatchingResourcePatternResolver().getResources("classpath*:mappings/product/*.xml"));
//
//        return bean.getObject();
//    }
//
//    @Bean("productSqlSessionTemplate")
//    public SqlSessionTemplate test2sqlsessiontemplate(
//            @Qualifier("productSqlSessionFactory") SqlSessionFactory sessionfactory) {
//        return new SqlSessionTemplate(sessionfactory);
//    }
}

