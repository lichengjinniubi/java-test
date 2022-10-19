package com.example.javatest.f_listerer.event;

import org.springframework.context.ApplicationEvent;

public class UserSaveEvent extends ApplicationEvent {


    public UserSaveEvent(Object source) {
        super(source);
    }
}
