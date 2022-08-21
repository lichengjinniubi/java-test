package com.example.javatest.AOPV1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlAspectApplication {

    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("xmlaspect.xml");
        FinanceService financeService = ctx.getBean(FinanceService.class);
        financeService.addMoney(123.45);
        financeService.subtractMoney(543.21);
        financeService.getMoneyById("abc");
    }
}
