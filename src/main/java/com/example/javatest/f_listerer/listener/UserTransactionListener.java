package com.example.javatest.f_listerer.listener;

import com.example.javatest.f_listerer.event.UserSaveEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;

@Component
public class UserTransactionListener implements ApplicationListener<UserSaveEvent> {



//    @TransactionalEventListener
//    public void onSaveUser(UserSaveEvent userSaveEvent){
//        System.out.println("监听到事务提交成功。。。。。。");
//    }

    @Override
    public void onApplicationEvent(UserSaveEvent event) {
        System.out.println("监听到事务提交成功。。。。。。");
    }
}
