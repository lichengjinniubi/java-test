package com.example.javatest.AopTest.proxy;

import com.example.javatest.AopTest.j_proxy.utils.LogUtils;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Objects;

@Slf4j
public class LogAdvisor implements InvocationHandler {

    private Object target;

    private List<String> methods;

    public LogAdvisor(Object target, List<String> methods) {
        this.target = target;
        this.methods = methods;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (this.methods.contains(method.getName())) {
            LogUtils.printLog(target.getClass().getName(), method.getName(), args);
        }
        return method.invoke(target, args);
    }
}
