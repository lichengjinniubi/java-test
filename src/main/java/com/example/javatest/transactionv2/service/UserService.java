package com.example.javatest.transactionv2.service;

import com.example.javatest.transaction.bean.User;
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


    public void saveAndQuery() {
        User user = new User();
        user.setName("阿巴阿巴");
        user.setTel("76786");
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus status) {

            }
        });
    }
}