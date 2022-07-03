package com.example.javatest.spi.v2.annotation;


import com.example.javatest.spi.v2.AbatractJdbcConfiguration;
import com.example.javatest.spi.v2.MysqlJdbcConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(MysqlJdbcConfiguration.class)
public @interface EnableJdbc {
}
