package com.antony_c.app.base_springboot.model;

/**
 * The HelloWorld class represents a simple greeting message.
 */
public class HelloWorld {
    private String value = "Hello World!";

    /**
     * Constructs a HelloWorld object with the default greeting message.
     */
    public HelloWorld() {
    }

    /**
     * Gets the greeting message.
     * 
     * @return the greeting message
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the greeting message.
     * 
     * @param value the new greeting message
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Returns the greeting message as a string representation of the HelloWorld
     * object.
     * 
     * @return the greeting message
     */
    @Override
    public String toString() {
        return getValue();
    }
}
