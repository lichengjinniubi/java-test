package com.example.javatest.threadLocal.controller;

import com.example.javatest.threadLocal.service.TestThreadDemo;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Proxy;
import java.util.concurrent.ExecutionException;

@RestController
@Slf4j
public class TestOneController {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private TestThreadDemo testThreadDemo;

    @RequestMapping("/getCar")
    public void getCar() throws InterruptedException, ExecutionException {
        testThreadDemo.testThread();

        //testThreadDemo.test1();
        logger.info("getCarTest");
    }

}
