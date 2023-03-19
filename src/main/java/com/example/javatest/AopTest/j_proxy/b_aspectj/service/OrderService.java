package com.example.javatest.AopTest.j_proxy.b_aspectj.service;

import java.util.List;

public interface OrderService {
    
    void createOrder();
    
    void deleteOrderById(String id);
    
    String getOrderById(String id);
    
    List<String> findAll();
}
