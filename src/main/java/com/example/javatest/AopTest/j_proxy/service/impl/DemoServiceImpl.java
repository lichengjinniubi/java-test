package com.example.javatest.AopTest.j_proxy.service.impl;

import com.example.javatest.AopTest.j_proxy.dao.DemoDao;
import com.example.javatest.AopTest.j_proxy.factory.BeanFactory;
import com.example.javatest.AopTest.j_proxy.service.DemoService;


import java.util.List;

public class DemoServiceImpl implements DemoService {
    
    DemoDao demoDao = (DemoDao) BeanFactory.getBean("demoDao");
    
    @Override
    public List<String> findAll() {
        return demoDao.findAll();
    }
    
    @Override
    public int add(String userId, int points) {
        return points;
    }
    
    @Override
    public int subtract(String userId, int points) {
        return points;
    }
    
    @Override
    public int multiply(String userId, int points) {
        return points;
    }
    
    @Override
    public int divide(String userId, int points) {
        return points;
    }
}
