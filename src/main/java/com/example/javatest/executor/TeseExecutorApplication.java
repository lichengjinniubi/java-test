package com.example.javatest.executor;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.*;

public class TeseExecutorApplication {

    private volatile static int aa = 0;


    public static void main(String[] args) throws InterruptedException {
            Thread t1 = new Thread(() -> {
                addOne();
            });

        Thread t2 = new Thread(() -> {
            addOne();
        });
        t1.start();
        t2.start();


        t1.join();
        t2.join();

        System.out.println(aa);
    }


    public static void addOne(){
       for(int i= 0; i<10000; i++){
           aa++;
       }
    }

    public static int getNum(){
        return aa;
    }
}
