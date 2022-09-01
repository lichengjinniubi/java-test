package com.example.javatest.JDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplateXmlApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        //ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc/spring-jdbc.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) ctx.getBean("getTem");
        jdbcTemplate.execute("insert into tbl_account (user_id, money) values (4, 100)");
    }
}
