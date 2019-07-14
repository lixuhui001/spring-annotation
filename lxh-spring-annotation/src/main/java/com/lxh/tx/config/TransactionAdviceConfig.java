package com.lxh.tx.config;

import com.atomikos.icatch.jta.J2eeUserTransaction;
import com.atomikos.icatch.jta.UserTransactionManager;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.Advisor;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.interceptor.DefaultTransactionAttribute;
import org.springframework.transaction.interceptor.NameMatchTransactionAttributeSource;
import org.springframework.transaction.interceptor.TransactionInterceptor;
import org.springframework.transaction.jta.JtaTransactionManager;

import javax.transaction.UserTransaction;


/**
 * @Auther: LiXuHui
 * @Date: 2019/5/30/030 16:46
 * @Description:
 */
@Aspect
@Configuration
@EnableTransactionManagement
public class TransactionAdviceConfig
{
    private static final String AOP_POINTCUT_EXPRESSION = "execution(* com.lxh.tx.service.*.* (..)))";


    /**
     * 自定义事务
     * MyBatis自动参与到spring事务管理中，无需额外配置，只要org.mybatis.spring.SqlSessionFactoryBean引用的数据源与DataSourceTransactionManager引用的数据源一致即可，否则事务管理会不起作用。
     *
     * @return
     */
    @Bean(name = "sysAtomikosTransactionManager", initMethod = "init", destroyMethod = "close")
    public UserTransactionManager userTransactionManager() throws Throwable
    {
        UserTransactionManager userTransactionManager = new UserTransactionManager();
        userTransactionManager.setForceShutdown(false);
        return userTransactionManager;
    }

    @Bean(name = "sysAtomikosUserTransaction")
    public J2eeUserTransaction j2eeUserTransaction() throws Throwable
    {
        J2eeUserTransaction j2eeUserTransaction = new J2eeUserTransaction();
        j2eeUserTransaction.setTransactionTimeout(300);
        return j2eeUserTransaction;
    }

    @Bean(name = "transactionManager")
    @DependsOn(value = {"sysAtomikosTransactionManager", "sysAtomikosUserTransaction"})
    public JtaTransactionManager jtaTransactionManager() throws Throwable
    {
        UserTransaction sysAtomikosUserTransaction = j2eeUserTransaction();
        UserTransactionManager sysAtomikosTransactionManager = userTransactionManager();
        JtaTransactionManager jtaTransactionManager = new JtaTransactionManager(sysAtomikosUserTransaction, sysAtomikosTransactionManager);
        System.out.println(jtaTransactionManager);
        return jtaTransactionManager;
    }


//    @Bean
//    @DependsOn(value = {"jtaTransactionManager"})
//    public TransactionInterceptor txAdvice(JtaTransactionManager jtaTransactionManager)
//    {
//
//
//        DefaultTransactionAttribute txAttr_REQUIRED = new DefaultTransactionAttribute();
//        txAttr_REQUIRED.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
//        DefaultTransactionAttribute txAttr_REQUIRED_READONLY = new DefaultTransactionAttribute();
//        txAttr_REQUIRED_READONLY.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
//        txAttr_REQUIRED_READONLY.setReadOnly(true);
//        NameMatchTransactionAttributeSource source = new NameMatchTransactionAttributeSource();
//        source.addTransactionalMethod("save*", txAttr_REQUIRED);
//        TransactionInterceptor transactionInterceptor = new TransactionInterceptor(jtaTransactionManager, source);
//        return transactionInterceptor;
//    }
//
//    @Bean
//    @DependsOn(value = {"jtaTransactionManager"})
//    public Advisor txAdviceAdvisor(@Qualifier("transactionManager") JtaTransactionManager jtaTransactionManager) throws Throwable
//    {
//        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
//        pointcut.setExpression(AOP_POINTCUT_EXPRESSION);
//        Advisor advisor = new DefaultPointcutAdvisor(pointcut, txAdvice(jtaTransactionManager));
//        return advisor;
//    }
}
