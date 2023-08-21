package com.example.javatest.JDBCV3.c_dao;


import com.example.javatest.JDBCV3.c_dao.bean.User;
import com.example.javatest.JDBCV3.c_dao.config.JdbcConfiguration;
import com.example.javatest.JDBCV3.c_dao.dao.UserDao;
import com.example.javatest.JDBCV3.c_dao.dao.impl.UserDaoImpl;
import com.example.javatest.JDBCV3.c_dao.dao.impl.UserDaoImpl2;
import com.example.javatest.JDBCV3.c_dao.dao.impl.UserDaoImpl3;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JdbcTemplateDaoApplication {
    
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JdbcConfiguration.class);
//        UserDao userDao = ctx.getBean(UserDaoImpl.class);
//        userDao.findAll().forEach(System.out::println);
        
        UserDao userDao3 = ctx.getBean(UserDaoImpl2.class);
        userDao3.findAll().forEach(System.out::println);
    }
}
