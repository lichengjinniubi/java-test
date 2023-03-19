package com.example.javatest.AopTest.j_proxy.c_cglib;

import com.example.javatest.AopTest.j_proxy.a_basic.Partner;
import com.example.javatest.AopTest.j_proxy.a_basic.Player;


public class Client {
    
    public static void main(String[] args) throws Exception {
        Player player = new Player("郝武辽");
        Partner partner = PartnerPlatform.getPartner(50);
        
        partner.receiveMoney(20);
        partner.playWith(player);
        
        partner.receiveMoney(200);
        partner.playWith(player);
    }
}
