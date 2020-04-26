package com.joshua.main;

import com.joshua.springboot.service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceImplTest {

    UserServiceImpl service = new UserServiceImpl();

    // Tests whether all methods gets created.

    @Test
    void addUser() {
        service.addUser("name","surname");
    }

    @Test
    void getUser() {
        service.addUser("name","surname"); // Add user before Testing getUser method.
        service.getUser(1001);
    }

    @Test
    void removeUser() {
        service.addUser("name","surname"); // Add user before Testing removeUser method.
        service.removeUser(1001);
    }


}