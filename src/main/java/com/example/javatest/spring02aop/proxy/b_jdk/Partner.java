package com.example.javatest.spring02aop.proxy.b_jdk;


import com.example.javatest.spring02aop.proxy.a_basic.Player;

/**
 * 游戏陪玩
 */
public interface Partner {
    
    /**
     * 收钱
     * @param money
     */
    void receiveMoney(int money);
    
    /**
     * 陪玩
     * @param player
     */
    void playWith(Player player);
}
