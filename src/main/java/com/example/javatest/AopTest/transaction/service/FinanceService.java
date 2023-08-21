package com.example.javatest.AopTest.transaction.service;

import com.example.javatest.AopTest.transaction.dao.FinanceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FinanceService {
    
    @Autowired
    FinanceDao financeDao;
    
    @Transactional
    public void transfer(Long source, Long target, int money) {
        financeDao.subtractMoney(source, money);
        financeDao.addMoney(target, money);
    }
}
