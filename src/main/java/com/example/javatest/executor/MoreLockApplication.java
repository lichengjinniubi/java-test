package com.example.javatest.executor;

import org.springframework.beans.factory.annotation.Autowired;

public class MoreLockApplication {



    public static void main(String[] args) throws InterruptedException {

            Account account1 = new Account();
            account1.setBalance(100);
            account1.setType(1);

            Account account2 = new Account();
            account2.setBalance(200);
            account2.setType(2);

            Account account3 = new Account();
            account3.setBalance(300);

            Thread thread1 = new Thread(() -> {
                try {
                    account1.transfer(account2, 1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            });

            Thread thread2 = new Thread(() -> {
                try {
                    Thread.sleep(2000);
                    account2.transfer(account3, 1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            });


            thread1.start();
            thread2.start();

            thread1.join();
            thread2.join();


    }
}
