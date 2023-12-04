package com.antony_c.app.base_springboot.model;

public class HelloWorld {
    private String value = "Hello World!";
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return value;
    }
    
}
