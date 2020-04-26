package com.joshua.springboot;


import com.joshua.springboot.service.UserServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {

        SpringApplication.run(MainApplication.class, args);

        UserServiceImpl service = new UserServiceImpl();

        service.addUser("Joshua","Mabotsa");
        service.addUser("Joshua2","Mabotsa2");
        service.addUser("Joshua3","Mabotsa3");

        service.removeUser(2);

        service.getUser(3);

        

    }

}
