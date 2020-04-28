package com.joshua.springboot.service;

import com.joshua.springboot.repository.FakeRepo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceImplTest {

    UserServiceImpl service = new UserServiceImpl(new FakeRepo());

    @Test
    void addUser() {

        assertEquals("[Joshua] entered",service.addUser("Joshua","Mabotsa") );
        service.removeUser(1);
    }

    @Test
    void removeUser() {
        service.addUser("Joshua","Mabotsa");
        assertEquals("[Joshua] removed",service.removeUser(1));
    }

    @Test
    void getUser() {
        service.addUser("Joshua","Mabotsa");
        assertEquals("hello [Joshua]",service.getUser(1) );
    }
}