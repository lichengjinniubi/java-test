package com.example.javatest.JDBC.d_declarativeanno;

import com.example.javatest.JDBC.d_declarativeanno.config.DeclarativeTransactionConfiguration;
import com.example.javatest.JDBC.d_declarativeanno.service.AccountService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

public class DeclarativeTransactionAnnoApplication {
    
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
                DeclarativeTransactionConfiguration.class);
//        UserService userService = ctx.getBean(UserService.class);
//        userService.saveAndQuery();
        AccountService accountService = ctx.getBean(AccountService.class);
        accountService.transfer(1, 2, 100);
    }
}
