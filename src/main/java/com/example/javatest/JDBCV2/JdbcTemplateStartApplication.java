package com.example.javatest.JDBCV2;

import com.example.javatest.JDBCV2.config.JdbcConfiguration;
import com.example.javatest.JDBCV2.dao.UserDao;
import com.example.javatest.JDBCV2.dao.impl.UserDaoImpl;
import com.example.javatest.JDBCV2.dao.impl.UserDaoImplV2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class JdbcTemplateStartApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JdbcConfiguration.class);
        UserDao userDao = ctx.getBean(UserDaoImplV2.class);
        userDao.findAll().forEach(System.out::println);
    }
}
