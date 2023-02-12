package com.example.javatest.imitate;

import com.example.javatest.imitate.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ImitateAopApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("com.example.javatest.imitate");
        UserService userService = ctx.getBean(UserService.class);
        userService.get("abc");
    }
}
