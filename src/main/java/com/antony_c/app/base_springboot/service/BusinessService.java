package com.antony_c.app.base_springboot.service;

import org.springframework.stereotype.Component;

import com.antony_c.app.base_springboot.model.HelloWorld;

/**
 * This class represents a business service that provides operations related to HelloWorld objects.
 */
@Component
public class BusinessService {
    public HelloWorld getHelloWorld() {
        return new HelloWorld();
    }

    public String setHelloWorld(HelloWorld helloWorld) {
        return helloWorld.getValue();
    }

    // Add a new method to update HelloWorld object
    public HelloWorld updateHelloWorld(HelloWorld helloWorld, String newValue) {
        helloWorld.setValue(newValue);
        return helloWorld;
    }
}
