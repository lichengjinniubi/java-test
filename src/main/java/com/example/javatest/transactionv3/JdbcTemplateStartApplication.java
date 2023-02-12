package com.example.javatest.transactionv3;

import com.example.javatest.transactionv3.config.DeclaraTransactionConfiguration;
import com.example.javatest.transactionv3.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcTemplateStartApplication {

    public static void main(String[] args) {
//        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc/spring-transaction.xml");
//        UserService userService = ctx.getBean(UserService.class);
//        userService.saveAndQuery();

        ApplicationContext ctx = new AnnotationConfigApplicationContext(DeclaraTransactionConfiguration.class);

        UserService userService = ctx.getBean(UserService.class);
        userService.saveAndQuery();
    }
}
