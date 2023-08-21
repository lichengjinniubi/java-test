package com.example.javatest.JDBC.f_listener;

import com.example.javatest.JDBC.f_listener.config.TransactionListenerConfiguration;
import com.example.javatest.JDBC.f_listener.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.transaction.annotation.ProxyTransactionManagementConfiguration;

public class TransactionListenerApplication {
    
    public static void main(String[] args) throws Exception {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
                TransactionListenerConfiguration.class);
        UserService userService = ctx.getBean(UserService.class);
        userService.findByid();
        //userService.saveUser();
    }
}
