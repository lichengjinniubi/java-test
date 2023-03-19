package com.example.javatest.AopTest.j_proxy.b_jdk;


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
