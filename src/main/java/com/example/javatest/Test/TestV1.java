package com.example.javatest.Test;

import java.util.concurrent.locks.ReentrantLock;

public class TestV1 {

    private static int count;

    private static ReentrantLock lock = new ReentrantLock();


    public static void increment() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count++;
    }

    public static void incrementWithLock() {
        lock.lock();
        try {
            Thread.sleep(10);
            count++;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }

    }


    public static synchronized void incrementWithLockV2() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count++;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                //increment();
                incrementWithLockV2();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                //increment();
                incrementWithLockV2();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(count);
    }

}
