package com.example.javatest.JDBCV3.transcation;


import com.example.javatest.JDBCV3.c_dao.config.JdbcConfiguration;
import com.example.javatest.JDBCV3.c_dao.dao.UserDao;
import com.example.javatest.JDBCV3.c_dao.dao.impl.UserDaoImpl2;
import com.example.javatest.JDBCV3.transcation.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;

public class JdbcTemplateDaoApplication {
    
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc/spring-transaction.xml");
//        UserDao userDao = ctx.getBean(UserDaoImpl.class);
//        userDao.findAll().forEach(System.out::println);
        UserService userService = ctx.getBean(UserService.class);
        userService.saveAndQuery();
    }
}
