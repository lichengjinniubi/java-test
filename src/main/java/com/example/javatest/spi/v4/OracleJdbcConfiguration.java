package com.example.javatest.spi.v4;

import com.alibaba.druid.pool.DruidDataSource;
import com.example.javatest.spi.v4.annotation.ConditionalOnClassName;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@ConditionalOnClassName("oracle.jdbc.driver.OracleDriver")
public class OracleJdbcConfiguration extends AbatractJdbcConfiguration{

    @Bean
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        dataSource.setUrl(environment.getProperty("jdbc.url"));
        dataSource.setUsername(environment.getProperty("jdbc.username"));
        dataSource.setPassword(environment.getProperty("jdbc.password"));
        return dataSource;
    }
}
