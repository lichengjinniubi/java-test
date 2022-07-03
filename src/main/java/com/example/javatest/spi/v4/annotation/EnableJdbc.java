package com.example.javatest.spi.v4.annotation;


import com.example.javatest.spi.v4.JdbcConfigSelector;
import com.example.javatest.spi.v4.MysqlJdbcConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(JdbcConfigSelector.class)
public @interface EnableJdbc {
}
