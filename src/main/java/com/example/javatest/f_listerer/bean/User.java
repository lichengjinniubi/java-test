package com.example.javatest.f_listerer.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

    private static final long serialVersionUID = 4299861864907862792L;

    private Integer id;
    private String name;
    private String tel;
}
