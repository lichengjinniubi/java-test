package com.example.javatest.AopTest.j_proxy.dao.impl;



import com.example.javatest.AopTest.j_proxy.dao.DemoDao;

import java.util.Arrays;
import java.util.List;

public class DemoDaoImpl implements DemoDao {
    
    @Override
    public List<String> findAll() {
        return Arrays.asList("aaa", "bbb", "ccc");
    }
}
