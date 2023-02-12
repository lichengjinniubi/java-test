package com.example.javatest.JDBCV2.dao;

import com.example.javatest.JDBCV2.bean.User;

import java.util.List;

public interface UserDao {

    void save(User user);
    User findById(Integer id);
    List<User> findAll();
}
