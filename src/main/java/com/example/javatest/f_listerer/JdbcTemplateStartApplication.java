package com.example.javatest.f_listerer;

import com.example.javatest.f_listerer.config.DeclaraTransactionConfiguration;
import com.example.javatest.f_listerer.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JdbcTemplateStartApplication {

    public static void main(String[] args) {
//        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc/spring-transaction.xml");
//        UserService userService = ctx.getBean(UserService.class);
//        userService.saveAndQuery();

        ApplicationContext ctx = new AnnotationConfigApplicationContext(DeclaraTransactionConfiguration.class);

        UserService userService = ctx.getBean(UserService.class);
        userService.saveUser();
    }
}
