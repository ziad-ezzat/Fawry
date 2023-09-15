package com.example.learnspring;

import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.*;

@Aspect
@Component
public class MyAspect {

    @Before("execution(* com.example.learnspring.*.*(..))")
    public void before() {
        System.out.println("Before");
    }

    @After("execution(* com.example.learnspring.*.*(..))")
    public void after() {
        System.out.println("After");
    }
}
