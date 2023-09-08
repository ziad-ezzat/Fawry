package com.example.learnspring;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    public String getMessage() {
        return "Hello From MyService!";
    }
}
