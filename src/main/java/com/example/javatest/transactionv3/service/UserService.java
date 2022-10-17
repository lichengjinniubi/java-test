package com.example.javatest.transactionv3.service;

import com.example.javatest.transactionv3.bean.User;
import com.example.javatest.transactionv3.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class UserService {

    @Autowired
    private UserDao userDao;


    public void saveAndQuery() {
        User user = new User();
        user.setName("阿巴阿巴");
        user.setTel("1236547ddd");

        userDao.save(user);
        int i = 1/0;

        List<User> userList = userDao.findAll();
        System.out.println(userList);
    }
}
