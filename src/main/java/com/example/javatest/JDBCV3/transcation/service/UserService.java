package com.example.javatest.JDBCV3.transcation.service;


import com.example.javatest.AopTest.transaction.aspect.Transactional;
import com.example.javatest.JDBCV3.transcation.bean.User;
import com.example.javatest.JDBCV3.transcation.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import java.util.List;

@Service
public class UserService {
    
    @Autowired
    TransactionTemplate transactionTemplate;
    
    @Autowired
    UserDao userDao;

    @Transactional
    public void saveAndQuery() {
        User user = new User();
        user.setName("阿巴阿巴");
        user.setTel("123654789");

        //没有使用事务
//        userDao.save(user);
//
//        int i = 1 / 0;
//
//        List<User> userList = userDao.findAll();
//        System.out.println(userList);

        //使用了事务
//          transactionTemplate.execute(status -> {
//              userDao.save(user);
//
//              int i = 1 / 0;
//
//              List<User> userList = userDao.findAll();
//              System.out.println(userList);
//              return null;
//          });

        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus status) {
                userDao.save(user);


              List<User> userList = userDao.findAll();
                System.out.println(userList);
            }
        });
    }
}
