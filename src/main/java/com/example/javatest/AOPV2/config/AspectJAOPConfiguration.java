package com.example.javatest.AOPV2.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.example.javatest.AOPV2")
@EnableAspectJAutoProxy
public class AspectJAOPConfiguration {
}
