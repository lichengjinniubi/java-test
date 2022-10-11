package com.example.javatest.imitate;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {

    @Before("execution(* com.example.javatest.imitate.service.*.*(..))")
    public void beforePrint() {
        System.out.println("LogAspect beforePrint ......");
    }

    @After("execution(* com.example.javatest.imitate.service.*.*(..))")
    public void afterPrint() {
        System.out.println("LogAspect afterPrint ......");
    }
}
