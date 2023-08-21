package com.example.javatest.AopTest.b_aspectj;

import com.example.javatest.AopTest.b_aspectj.config.AspectJAOPConfiguration;
import com.example.javatest.AopTest.b_aspectj.service.FinanceService;
import com.example.javatest.AopTest.b_aspectj.service.OrderService;
import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationAspectJApplication {
    
    public static void main(String[] args) throws Exception {
        //new AnnotationAwareAspectJAutoProxyCreator().postProcessAfterInitialization();

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
                AspectJAOPConfiguration.class);
        FinanceService financeService = ctx.getBean(FinanceService.class);
        financeService.addMoney(123.45);

//        OrderService financeService = ctx.getBean(OrderService.class);
//        financeService.getOrderById("1");
    }
}
