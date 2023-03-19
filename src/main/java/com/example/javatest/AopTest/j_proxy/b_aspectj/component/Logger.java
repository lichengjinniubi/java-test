package com.example.javatest.AopTest.j_proxy.b_aspectj.component;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Aspect
@Component
@Slf4j
public class Logger {
    
//    @Before("execution(public * com.example.javatest.AopTest.j_proxy.b_aspectj.service.FinanceService.*(..))")
//    public void beforePrint(JoinPoint joinPoint) {
//        MethodSignature methodSubstitution = (MethodSignature) joinPoint.getSignature();
//
//        System.out.println("Logger beforePrint run ......"+ methodSubstitution.getMethod().getName());
//    }
//
////    @After("execution(* com.linkedbear.spring.aop.b_aspectj.service.*.*(String)))")
//    @After("@annotation(com.example.javatest.AopTest.j_proxy.b_aspectj.component.Log)")
//    public void afterPrint() {
//        System.out.println("Logger Annotation afterPrint run ......");
//    }
//
//    //@AfterReturning(value = "execution(* com.example.javatest.AopTest.j_proxy.b_aspectj.service.*.*(String)))", returning = "val")
//    @AfterReturning(value = "execution(* com.example.javatest.AopTest.j_proxy.b_aspectj.service.FinanceService.*(..)))", returning = "numValue")
//    public void afterReturningPrint(Object numValue) {
//        System.out.println("Logger afterReturningPrint runv ......");
//        System.out.println("返回的数据：" + numValue);
//    }
//
//    //@AfterThrowing(value = "defaultPointcut()", throwing = "e")
//    @AfterThrowing(value = "execution(* com.example.javatest.AopTest.j_proxy.b_aspectj.service.FinanceService.*(..)))", throwing = "e")
//    public void afterThrowingPrint(Exception e) throws Exception{
//        System.out.println(e.getMessage());
//        System.out.println("Logger afterThrowingPrint run ......");
//    }
    
    @Around("execution(public * com.example.javatest.AopTest.j_proxy.b_aspectj.service.FinanceService.*(..))")
    public Object aroundPrint(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Logger aroundPrint before run ......");
        try {
            Object retVal = joinPoint.proceed();
            System.out.println("Logger aroundPrint afterReturning run ......");
            return  retVal;
        } catch (Throwable e) {
            System.out.println("Logger aroundPrint afterThrowing run ......");
            throw e;
        } finally {
            System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
            System.out.println(joinPoint.proceed());
            System.out.println("++++++++++++++");
        }


    }
    
    @Pointcut("execution(* com.example.javatest.AopTest.j_proxy.b_aspectj.service.*.*(String)))")
    public void defaultPointcut() {
    
    }
}
