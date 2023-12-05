package com.antony_c.app.base_springboot;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.antony_c.app.base_springboot.model.HelloWorld;


public class HelloWordAssertJTests {
    @Test
    public void testGetValue() {
        // ARRANGE
        HelloWorld helloWorld = new HelloWorld();
        
        // ACT
        String result = helloWorld.getValue();
        
        // ASSERT
        assertThat(result).isEqualTo("Hello World!");
    }

    @Test
    public void testSetValue() {
        // ARRANGE
        HelloWorld helloWorld = new HelloWorld();
        
        // ACT
        helloWorld.setValue("New Value");
        String result = helloWorld.getValue();
        
        // ASSERT
        assertThat(result).isEqualTo("New Value");
    }

    @Test
    public void testToString() {
        // ARRANGE
        HelloWorld helloWorld = new HelloWorld();
        
        // ACT
        String result = helloWorld.toString();
        
        // ASSERT
        assertThat(result).isEqualTo("Hello World!");
    }
}
