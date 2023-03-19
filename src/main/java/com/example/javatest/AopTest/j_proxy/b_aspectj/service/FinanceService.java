package com.example.javatest.AopTest.j_proxy.b_aspectj.service;

import com.example.javatest.AopTest.j_proxy.b_aspectj.component.Log;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class FinanceService {

    @Log
    public void addMoney(double money) {
        System.out.println("FinanceService 收钱 === " + money);
    }
    
    @Log
    public double subtractMoney(double money) {
       // try {
            System.out.println("FinanceService 付钱 === " + money);
//            Map<String, String> aa = new HashMap<>();
//            aa.get("1").length();
//        }catch (Exception e) {
////            Map<String, String> aa = new HashMap<>();
////            aa.get("1").length();
//        }


        return money+money;
    }
    
    public double subtractMoney(double money, String id) throws Exception {
        System.out.println("FinanceService 付钱 === " + money);
        return money;
    }
    
    public double getMoneyById(String id) {
        Map<String, String> aa = new HashMap<>();
        aa.get("1").length();
        return 13d;
    }
}
