package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.RequestWrapper;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        System.out.println("123");
        System.out.println("1231");
        SpringApplication.run(DemoApplication.class, args);
    }

}
