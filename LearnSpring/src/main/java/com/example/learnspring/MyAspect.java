package com.example.learnspring;

import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.*;

@Aspect
public class MyAspect {

    @Before("execution(* com.example.learnspring.*.*(..))")
    public void before() {
        System.out.println("Before");
    }

    @After("execution(* com.example.learnspring.*.*(..))")
    public void after() {
        System.out.println("After");
    }

    @AfterReturning("execution(* com.example.learnspring.*.*(..))")
    public void afterReturning() {
        System.out.println("AfterReturning");
    }

    @AfterThrowing("execution(* com.example.learnspring.*.*(..))")
    public void afterThrowing() {
        System.out.println("AfterThrowing");
    }

    @Around("execution(* com.example.learnspring.*.*(..))")
    public void around() {
        System.out.println("Around");
    }
}
