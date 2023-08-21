package com.example.javatest.JDBC.f_listener.listener;

import com.example.javatest.JDBC.bean.User;
import com.example.javatest.JDBC.f_listener.event.UserFindEvent;
import com.example.javatest.JDBC.f_listener.event.UserSaveEvent;
import org.springframework.context.PayloadApplicationEvent;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

@Component
public class UserTransactionListener {
    
    @TransactionalEventListener(phase = TransactionPhase.BEFORE_COMMIT)
    @Order(1)
    public void onSaveUser(PayloadApplicationEvent<User> event) {
        System.out.println("监听到保存用户事务准备提交 ......");
    }
    
    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
    @Order(2)
    public void onSaveUser2(PayloadApplicationEvent<User> event) {
        System.out.println("监听到保存用户事务提交成功 ......");
    }
    
    @TransactionalEventListener(phase = TransactionPhase.AFTER_ROLLBACK)
    @Order(3)
    public void onSaveUser3(PayloadApplicationEvent<User> event) {
        System.out.println("监听到保存用户事务回滚 ......");
    }
    
    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMPLETION)
    @Order(4)
    public void onSaveUser4(PayloadApplicationEvent<User> event) {
        System.out.println("监听到保存用户事务完成 ......");
    }
    
    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
    @Order(5)
    public void onSaveUserEvent(UserSaveEvent event) {
        System.out.println("监听到保存用户事务提交成功 ......");
    }

    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
    @Order(6)
    public void onQueryUserEvent(UserFindEvent event) {
        System.out.println("监听到查询用户事务提交成功 ......");
    }

    @TransactionalEventListener(phase = TransactionPhase.BEFORE_COMMIT)
    @Order(6)
    public void onBeforeQueryUserEvent(UserFindEvent event) {
        System.out.println("监听到查询用户事务提交之前状态 ......");
    }
}
