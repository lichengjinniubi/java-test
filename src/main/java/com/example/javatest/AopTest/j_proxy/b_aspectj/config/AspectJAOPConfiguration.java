package com.example.javatest.AopTest.j_proxy.b_aspectj.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.example.javatest.AopTest.j_proxy.b_aspectj")
@EnableAspectJAutoProxy
public class AspectJAOPConfiguration {
    
}
