package com.example.javatest.AOPV2.service;

import com.example.javatest.AOPV2.component.Log;
import org.springframework.stereotype.Component;

import java.sql.DriverManager;

@Component
public class FinanceService {

    public void addMoney(double money) {
        System.out.println("FinanceServiceTransaction 收钱 === " + money);
    }


    @Log
    public void addMoneyV2(int money) {
        System.out.println("FinanceServiceTransaction 收钱V2 === " + money);
    }

    public double subtractMoney(double money) throws Exception{
        System.out.println("FinanceServiceTransaction 付钱 === " + money);
        return money;
    }

    public double getMoneyById(String id) {
        System.out.println("FinanceServiceTransaction 查询账户，id为" + id);
        return Math.random();
    }
}
