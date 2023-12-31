package com.example.beanannotationapplication;

import com.example.beanannotationapplication.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BeanannotationApplication{

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanannotationApplication.class);
        //By its type
        UserService user = ctx.getBean(UserService.class);
        System.out.println("Printing user:"+user.getList());
    }
}