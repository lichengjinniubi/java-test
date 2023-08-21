package com.example.javatest.AOPV1;

public class FinanceService {

    public void addMoney(double money) {
        System.out.println("FinanceServiceTransaction 收钱 === " + money);
    }

    public double subtractMoney(double money) throws Exception{
        System.out.println("FinanceServiceTransaction 付钱 === " + money);

        return money;
    }

    public double getMoneyById(String id) {
        try{
            throw new RuntimeException();
        }catch (Exception e){

        }

//        System.out.println("FinanceServiceTransaction 查询账户，id为" + id);
        return Math.random();
    }
}
