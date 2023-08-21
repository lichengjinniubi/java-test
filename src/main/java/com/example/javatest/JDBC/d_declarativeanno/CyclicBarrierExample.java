package com.example.javatest.JDBC.d_declarativeanno;

import java.util.concurrent.*;

public class CyclicBarrierExample {

    private static final int num = 5;
    private static final CyclicBarrier cyclicBarrier = new CyclicBarrier(6);

    public static void main(String[] args) throws InterruptedException {
        ExecutorService threadPool = Executors.newFixedThreadPool(10);


        for(int i = 0; i < num; i++){
            final int threadNum = i;
            //Thread.sleep(500);
            threadPool.execute(() -> {
                try {
                    test(threadNum);
                }catch (Exception e){
                    e.printStackTrace();
                }
            });
        }

        threadPool.shutdown();
    }


    public static void test(int threadNum) throws InterruptedException{
        System.out.println("threadNum:"+threadNum+"is ready");
        try{
            cyclicBarrier.await(60, TimeUnit.SECONDS);
        }catch (Exception e){

        }

        System.out.println("threadNum:"+threadNum+"is finish");
    }
}
