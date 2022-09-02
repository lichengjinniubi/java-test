package com.example.javatest.JDBC;

import com.example.javatest.JDBC.bean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class JdbcTemplateXmlApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        //ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc/spring-jdbc.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) ctx.getBean("getTem");
        //jdbcTemplate.execute("insert into tbl_account (user_id, money) values (4, 100)");
        List<User> userList = jdbcTemplate.query("select * from tbl_user where id > ?", new BeanPropertyRowMapper<>(User.class), 2);
        userList.forEach(System.out::println);
    }
}
