package com.example.javatest.AopTest.transaction.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.example.javatest.AopTest.transaction")
public class TransactionAspectConfiguration {
    
}
