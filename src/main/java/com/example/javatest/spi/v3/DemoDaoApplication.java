package com.example.javatest.spi.v3;

import org.springframework.core.io.support.SpringFactoriesLoader;

import java.util.List;
import java.util.ServiceLoader;

public class DemoDaoApplication {

    public static void main(String[] args) {
        List<DemoDao> demoDaos = SpringFactoriesLoader
                .loadFactories(DemoDao.class, DemoDaoApplication.class.getClassLoader());
        demoDaos.forEach(dao -> {
            System.out.println(dao);
        });
    }
}
