package com.example.javatest.pointsLog.servlet;

import com.example.javatest.pointsLog.factory.BeanFactory;
import com.example.javatest.pointsLog.service.DemoService;
import com.example.javatest.pointsLog.utils.LogUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Proxy;

@RestController
public class DemoServlet10 extends HttpServlet{
    
    DemoService demoService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        DemoService demoService = (DemoService) BeanFactory.getBean("demoService");
        System.out.println(demoService);
        Class<? extends DemoService> clazz = demoService.getClass();
        this.demoService = (DemoService) Proxy
                .newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), (proxy, method, args) -> {
                    LogUtils.printLog("DemoService", method.getName(), args);
                    return method.invoke(demoService, args);
                });
    }


//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.getWriter().println(demoService.findAll().toString());
//        demoService.add("bearbear", 666);
//        demoService.subtract("bearbear", 666);
//    }

    @RequestMapping("/getPoint")
    public int getPoint(){
        return demoService.add("bearbear", 666);
        //demoService.subtract("bearbear", 666);
    }
}
