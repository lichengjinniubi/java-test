package com.example.javatest.executor;

import lombok.Data;
import org.springframework.stereotype.Service;

@Data
public class Account {

    private int balance;

    private int type;


    public void transfer(Account target, int amt) throws InterruptedException {
        synchronized (Account.class) {
            if(this.type == 1){
                Thread.sleep(10000);
            }
            System.out.println("********");
            System.out.println(this);
            if (this.balance > amt) {
                System.out.println(this.balance);
                this.balance -= amt;
                target.balance += amt;
            }
        }

    }


    public synchronized void transferV2(Account target, int amt) throws InterruptedException {
        if(this.type == 1){
            Thread.sleep(10000);
        }
        System.out.println("********");
        System.out.println(this);
            if (this.balance > amt) {
                this.balance -= amt;
                target.balance += amt;
            }

    }


    public void transferV3(Account target, int amt){
            this.balance -= 1;

    }
}
