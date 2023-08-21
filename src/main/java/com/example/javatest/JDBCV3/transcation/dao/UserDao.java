package com.example.javatest.JDBCV3.transcation.dao;


import com.example.javatest.JDBCV3.transcation.bean.User;

import java.util.List;

public interface UserDao {
    
    void save(com.example.javatest.JDBCV3.transcation.bean.User user);
    
    User findById(Integer id);
    
    List<com.example.javatest.JDBCV3.transcation.bean.User> findAll();
}
