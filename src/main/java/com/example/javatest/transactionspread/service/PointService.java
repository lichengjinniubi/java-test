package com.example.javatest.transactionspread.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

@Service
public class PointService {

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void addPoint() {
        System.out.println(TransactionSynchronizationManager.getCurrentTransactionName());

        System.out.println("addPoint 添加积分 ......");
    }
}
