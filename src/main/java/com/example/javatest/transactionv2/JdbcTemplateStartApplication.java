package com.example.javatest.transactionv2;

import com.example.javatest.transactionv2.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcTemplateStartApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc/spring-transaction.xml");
        UserService userService = ctx.getBean(UserService.class);
        userService.saveAndQuery();
    }
}
