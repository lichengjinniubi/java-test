package com.example.javatest.AopTest.transaction;

import com.example.javatest.AopTest.transaction.config.TransactionAspectConfiguration;
import com.example.javatest.AopTest.transaction.service.FinanceService;
import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TransactionApplication {
    
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TransactionAspectConfiguration.class);
        FinanceService financeService = ctx.getBean(FinanceService.class);
//        new AnnotationAwareAspectJAutoProxyCreator().postProcessBeforeInstantiation();
//        new AnnotationAwareAspectJAutoProxyCreator().postProcessAfterInitialization();
        financeService.transfer(1L, 2L, 100);
    }
}
