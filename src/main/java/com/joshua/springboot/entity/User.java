package com.joshua.springboot.entity;

import org.springframework.stereotype.Component;


public class User {

    // fields
    private long id;
    private String name;
    private String surname;

    public User(long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
