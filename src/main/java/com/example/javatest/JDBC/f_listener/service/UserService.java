package com.example.javatest.JDBC.f_listener.service;

import com.example.javatest.JDBC.bean.User;
import com.example.javatest.JDBC.f_listener.dao.UserDao;
import com.example.javatest.JDBC.f_listener.event.UserFindEvent;
import com.example.javatest.JDBC.f_listener.event.UserSaveEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    
    @Autowired
    UserDao userDao;
    
    @Autowired
    ApplicationEventPublisher eventPublisher;
    
    @Transactional
    public void saveUser() {
        User user = new User();
        user.setName("哈哈哈");
        user.setTel("123");
    
        userDao.save(user);
        System.out.println("User save ......");
//        eventPublisher.publishEvent(user);
//        int i = 1 / 0;
        
        eventPublisher.publishEvent(new UserSaveEvent(user));
    }


    @Transactional
    public void findByid() {
        User user = new User();
        user.setName("哈哈哈");
        user.setTel("123");

        userDao.findById(3);
        System.out.println("User query ......");
//        eventPublisher.publishEvent(user);
//        int i = 1 / 0;

        eventPublisher.publishEvent(new UserFindEvent(user));
    }
}
