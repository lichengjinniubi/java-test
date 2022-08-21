package com.example.javatest.spring02aop.proxy.b_jdk;

import com.example.javatest.spring02aop.proxy.a_basic.Player;

public class Client {
    
    public static void main(String[] args) throws Exception {
        Player player = new Player("郝武辽");
        System.out.println(player);
        Partner partner = PartnerPlatform.getPartner(400);
        System.out.println(partner);
        partner.receiveMoney(200);
        partner.playWith(player);
    
//        partner.receiveMoney(200);
//        partner.playWith(player);
    }
}
