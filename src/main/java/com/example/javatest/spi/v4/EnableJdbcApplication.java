package com.example.javatest.spi.v4;

import com.alibaba.druid.pool.DruidDataSource;
import com.example.javatest.spi.v3.DemoDao;
import com.example.javatest.spi.v3.DemoDaoApplication;
import com.example.javatest.spi.v4.annotation.EnableJdbc;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.support.SpringFactoriesLoader;

import java.util.List;

@EnableJdbc
@PropertySource("application.properties")
public class EnableJdbcApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(EnableJdbcApplication.class);
        DruidDataSource dataSource = ctx.getBean(DruidDataSource.class);
        System.out.println(dataSource.getUrl());
    }
}
