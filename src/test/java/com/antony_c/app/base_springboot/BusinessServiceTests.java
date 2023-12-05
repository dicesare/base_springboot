package com.antony_c.app.base_springboot;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Instant;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.antony_c.app.base_springboot.model.HelloWorld;
import com.antony_c.app.base_springboot.service.BusinessService;

public class BusinessServiceTests {
    private BusinessService businessService;
    private HelloWorld helloWorld;

    private static Instant startedAt;

    @BeforeAll
    public static void initStartingTime() {
        startedAt = Instant.now();
        System.out.println("Before all tests");
    }

    @AfterAll
    public static void showTestDuration() {
        Instant endedAt = Instant.now();
        long duration = startedAt.toEpochMilli() - endedAt.toEpochMilli();
        System.out.println("Tests duration: " + duration + " ms.");
        System.out.println("After all tests");
    }
    
    @BeforeEach
    public void setup() {
        businessService = new BusinessService();
        helloWorld = new HelloWorld();
        System.out.println("Before each test");
    }

    @AfterEach
    public void teardown() {
        businessService = null;
        helloWorld = null;
        System.out.println("After each test");
    }

    @Test
    public void testGetHelloWorld() {
        //ARRANGE
        //ACT
        HelloWorld helloWorld = businessService.getHelloWorld();
        //ASSERT
        assertNotNull(helloWorld);
        assertEquals("Hello World!", helloWorld.toString());
        //fail("Not yet implemented");
    }

    @Test
    public void testSetValue() throws Exception {
        //ARRANGE
        String expectedValue = "Hello New World, after the end!";
        //ACT
        helloWorld.setValue(expectedValue);
        String actualValue = businessService.setHelloWorld(helloWorld);
        //ASSERT
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void testUpdateHelloWorld() {

        // Call the updateHelloWorld method with a new value
        HelloWorld updatedHelloWorld = businessService.updateHelloWorld(helloWorld, "World");

        // Assert that the value of the updated HelloWorld object is equal to the new value
        assertEquals("World", updatedHelloWorld.getValue());
    }
}

