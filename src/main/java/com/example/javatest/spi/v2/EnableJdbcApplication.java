package com.example.javatest.spi.v2;

import com.alibaba.druid.pool.DruidDataSource;
import com.example.javatest.spi.v2.annotation.EnableJdbc;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;

@EnableJdbc
@PropertySource("application.properties")
public class EnableJdbcApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(EnableJdbcApplication.class);
        DruidDataSource dataSource = ctx.getBean(DruidDataSource.class);
        System.out.println(dataSource.getUrl());
    }
}
