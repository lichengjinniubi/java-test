package com.example.javatest.JDBC.d_declarativeanno;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchExample {

    private static final int num = 500;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService threadPool = Executors.newFixedThreadPool(300);
        final CountDownLatch countDownLatch = new CountDownLatch(20);

        for(int i = 0; i < num; i++){
            final int threadNum = i;
            threadPool.execute(() -> {
                try {
                    test(threadNum);
                }catch (Exception e){
                    e.printStackTrace();
                }
                finally {
                    countDownLatch.countDown();
                }
            });
        }

        countDownLatch.await();
        threadPool.shutdown();
        System.out.println("finish");
    }


    public static void test(int threadNum) throws InterruptedException{
        Thread.sleep(1000);
        System.out.println("threadnum:"+threadNum);
        Thread.sleep(1000);
    }
}
