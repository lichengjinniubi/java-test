package com.example.javatest.transactionspread;

import com.example.javatest.transactionspread.config.DeclaraTransactionConfiguration;
import com.example.javatest.transactionspread.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.transaction.TransactionDefinition;

public class JdbcTemplateStartApplication {

    public static void main(String[] args) {
//        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc/spring-transaction.xml");
//        UserService userService = ctx.getBean(UserService.class);
//        userService.saveAndQuery();

        ApplicationContext ctx = new AnnotationConfigApplicationContext(DeclaraTransactionConfiguration.class);

        UserService userService = ctx.getBean(UserService.class);
        userService.register();
    }
}
