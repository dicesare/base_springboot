package com.antony_c.app.base_springboot.service;

import org.springframework.stereotype.Component;

import com.antony_c.app.base_springboot.model.HelloWorld;

@Component
public class BusinessService {
    public HelloWorld getHelloWorld() {
        return new HelloWorld();
    }
}
