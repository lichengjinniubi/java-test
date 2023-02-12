package com.example.javatest.AOPV2;

import com.example.javatest.AOPV2.config.AspectJAOPConfiguration;
import com.example.javatest.AOPV2.service.FinanceService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationAspectJApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AspectJAOPConfiguration.class);
        FinanceService financeService = ctx.getBean(FinanceService.class);
        financeService.addMoneyV2(33);
        //financeService.getMoneyById("id");
    }
}
