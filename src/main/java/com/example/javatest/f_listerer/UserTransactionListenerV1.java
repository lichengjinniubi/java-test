package com.example.javatest.f_listerer;

import com.example.javatest.f_listerer.bean.User;
import org.springframework.context.PayloadApplicationEvent;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;


@Component
public class UserTransactionListenerV1 {

    @TransactionalEventListener
    public void saveOnUser(PayloadApplicationEvent<User> event){
        System.out.println("监听到保存用户事务提交 ......");
    }
}
