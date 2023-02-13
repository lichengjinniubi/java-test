package com.example.javatest.spring02aop.proxy.b_jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * 陪玩平台
 */
public class PartnerPlatform {
    
    private static List<Partner> partners = new ArrayList<>();
    
    static {
        partners.add(new IndividualPartner("肖洁洁"));
        partners.add(new IndividualPartner("田苟"));
        partners.add(new IndividualPartner("高总裁"));
    }
    
    /**
     * 由陪玩平台根据预算推荐陪玩
     * @param money 预算
     * @return
     */
    public static Partner getPartner(int money) {
        Partner partner = partners.remove(0);
        System.out.println(money);
        return (Partner) Proxy.newProxyInstance(partner.getClass().getClassLoader(), partner.getClass().getInterfaces(),
                new InvocationHandler() {
                    private int budget = money;
                    private boolean status = false;

                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // 如果在付钱时没给够，则标记budget为异常值
                        System.out.println(method);
                        if (method.getName().equals("receiveMoney")) {
                            int money = (int) args[0];
                            this.status = money >= budget;
                        }

                        System.out.println(this.status);
                        if (status) {
                            return method.invoke(partner, args);
                        }
                        return null;
                    }
                });
    }
}
