package com.example.learnspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearnSpringApplication {
    
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(LearnSpringApplication.class, args);

        MyComponent myComponent = context.getBean(MyComponent.class);
        System.out.println(myComponent.getMessage());
    }
}
