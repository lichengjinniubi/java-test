package com.example.javatest.JDBC.f_listener.event;

import org.springframework.context.ApplicationEvent;

public class UserFindEvent extends ApplicationEvent {

    public UserFindEvent(Object source) {
        super(source);
    }
}
