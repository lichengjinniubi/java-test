package com.example.javatest.AopTest.controller;

import com.example.javatest.AopTest.j_proxy.b_aspectj.bean.ResultV2;
import com.example.javatest.AopTest.j_proxy.b_aspectj.service.FinanceService;
import com.example.javatest.AopTest.j_proxy.factory.BeanFactory;
import com.example.javatest.AopTest.j_proxy.service.DemoService;
import com.example.javatest.AopTest.j_proxy.utils.LogUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.transform.Result;
import java.io.IOException;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.Map;

@RestController
@Slf4j
public class TestOneController {


    @Autowired
    private FinanceService financeService;

    @RequestMapping("/getCar")
    public void getCar(){
        DemoService demoService = (DemoService) BeanFactory.getBeanV2("demoService");
        System.out.println(demoService);
        System.out.println(demoService.findAll().toString());
        demoService.add("bearbear", 666);
        demoService.subtract("bearbear", 666);
    }



    @RequestMapping("/testAop")
    public ResultV2 testAop(){
        log.info("testAop {}",11111);

        return ResultV2.successResult(financeService.subtractMoney(11.4));
    }
}
