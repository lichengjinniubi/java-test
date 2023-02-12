package com.example.javatest.f_listerer.service;

import com.example.javatest.f_listerer.bean.User;
import com.example.javatest.f_listerer.dao.UserDao;
import com.example.javatest.f_listerer.event.UserSaveEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    //@Transactional
    public void saveUser() {
        User user = new User();
        user.setName("哈哈哈");
        user.setTel("123");

        userDao.save(user);
        System.out.println("User save ......");
        eventPublisher.publishEvent(new UserSaveEvent(user));
    }
}
