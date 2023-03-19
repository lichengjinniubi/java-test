package com.example.javatest.AopTest.j_proxy.b_aspectj;


import com.alibaba.druid.support.json.JSONUtils;
import com.example.javatest.AopTest.j_proxy.b_aspectj.bean.User;
import com.example.javatest.AopTest.j_proxy.b_aspectj.config.AspectJAOPConfiguration;
import com.example.javatest.AopTest.j_proxy.b_aspectj.service.FinanceService;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;

import java.util.*;
import java.util.stream.Collectors;

public class AnnotationAspectJApplication {
    
    public static void main(String[] args) throws Exception {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
                AspectJAOPConfiguration.class);
        FinanceService financeService = ctx.getBean(FinanceService.class);
        financeService.subtractMoney(11.3);


    }
}
