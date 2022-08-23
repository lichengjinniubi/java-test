package com.example.javatest.AOPV2.component;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {

    @Before("defaultPoint()")
    public void beforePrint() {
        System.out.println("Logger beforePrint run ......");
    }

    @After("defaultPoint()")
    public void afterPrint() {
        System.out.println("Logger afterPrint run ......");
    }

    @After("@annotation(com.example.javatest.AOPV2.component.Log)")
    public void afterPrintV2() {
        System.out.println("Logger afterPrintV2 run ......");
    }

    @AfterReturning("defaultPoint()")
    public void afterReturningPrint() {
        System.out.println("Logger afterReturningPrint run ......");
    }


    @AfterThrowing("execution(public * com.example.javatest.AOPV2.service.*.*(String))")
    public void afterThrowingPrint() {
        System.out.println("Logger afterThrowingPrint run ......");
    }


    @Pointcut("execution(public * com.example.javatest.AOPV2.service.*.*(String))")
    public void defaultPoint(){

    }

    /**
     * 环绕式通知
     * @param joinPoint
     * @return
     * @throws Throwable
     */
    @Around("execution(public * com.example.javatest.AOPV2.service.FinanceService.*(double))")
    public Object aroundPrint(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("Logger aroundPrint before run ......");
        try {
            Object retVal = joinPoint.proceed();
            System.out.println("Logger aroundPrint afterReturning run ......");
            return retVal;
        } catch (Throwable e) {
            System.out.println("Logger aroundPrint afterThrowing run ......");
            throw e;
        } finally {
            System.out.println("Logger aroundPrint after run ......");
        }
    }
}
