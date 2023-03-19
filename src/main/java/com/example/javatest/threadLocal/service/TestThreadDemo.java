package com.example.javatest.threadLocal.service;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@Component
@Slf4j
public class TestThreadDemo {

    Logger logger = LoggerFactory.getLogger(getClass());

    private static ThreadLocal<String> localVar = new ThreadLocal<String>();

    public void print(String str) {
        //打印当前线程中本地内存中本地变量的值
        System.out.println(str + " :" + localVar.get());
        //清除本地内存中的本地变量
        localVar.remove();

    }




    public void testThread() throws InterruptedException {
        localVar.set("aa");
//        new Thread(new Runnable() {
//            public void run() {
//                localVar.set("local_A");
//                print("A");
//                //打印本地变量
//                System.out.println("after remove : " + localVar.get());
//
//            }
//        }, "A").start();
//
//        Thread.sleep(1000);
//
//        new Thread(new Runnable() {
//            public void run() {
//                localVar.set("local_B");
//                print("B");
//                System.out.println("after remove : " + localVar.get());
//
//            }
//        }, "B").start();
    }


    public void test1() throws ExecutionException, InterruptedException {
        System.out.println(Thread.currentThread().getId());
        String bb = "22222222";
        CompletableFuture<Long> aa = CompletableFuture.supplyAsync(()->{
            logger.info("test1V2 bb:{}", bb);
            return Thread.currentThread().getId();
        });
        System.out.println(aa.get());
    }

}
