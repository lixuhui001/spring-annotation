package com.lxh.tx.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.xa.DruidXADataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;


@Configuration
@ComponentScan("com.lxh.tx")
//@MapperScan(basePackages = "com.lxh.tx.dao")
@MapperScan(basePackages = "com.lxh.tx.dao.product", sqlSessionFactoryRef = "productDataSource")

@PropertySource(value = {"classpath:/database.properties"})
@EnableTransactionManagement
@Import({DataSourceConfigProduct.class,TransactionAdviceConfig.class})

public class TxConfig {
    @Value("${master.url}")
    private String url;
    @Value("${master.username}")
    private String username;
    @Value("${master.password}")
    private String password;


    @Bean(name = "productDataSource")
    public DataSource productDataSource() {
        DruidXADataSource druidXADataSource = new DruidXADataSource();
        // 数据库驱动
        // 相应驱动的jdbcUrl
//        druidXADataSource.set
        druidXADataSource.setDriverClassName("org.gjt.mm.mysql.Driver");
        druidXADataSource.setUrl(url);
        // 数据库的用户名
        druidXADataSource.setUsername(username);
        // 数据库的密码
        druidXADataSource.setPassword(password);

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
        druidXADataSource.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize);*/

        return druidXADataSource;
    }

    @Bean(name = "productSqlSessionFactory")
    public SqlSessionFactory test2SqlSessionFactory(DataSource productDataSource)
            throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(productDataSource);
        bean.setMapperLocations(
                new PathMatchingResourcePatternResolver().getResources("classpath*:mappings/product/*.xml"));

        return bean.getObject();
    }

    //
    @Bean("productSqlSessionTemplate")
    public SqlSessionTemplate test2sqlsessiontemplate(
            @Qualifier("productSqlSessionFactory") SqlSessionFactory sessionfactory) {
        SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sessionfactory);
        return new SqlSessionTemplate(sessionfactory);
    }

    @Bean
    public PlatformTransactionManager transactionManager() throws Exception{
        return new DataSourceTransactionManager(productDataSource());
    }
}
