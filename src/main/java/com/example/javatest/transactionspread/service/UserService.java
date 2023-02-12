package com.example.javatest.transactionspread.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

@Service
public class UserService {

    @Autowired
    private PointService pointService;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void register() {
        System.out.println(TransactionSynchronizationManager.getCurrentTransactionName());

        // 持久化操作 ......
        System.out.println("register 注册用户 ......");

        pointService.addPoint();
    }
}
