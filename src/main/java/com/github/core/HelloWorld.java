package com.github.core;

/**
 * Created by kazan on 12/07/17.
 */
public class HelloWorld {

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Your first issue: "+ message);
    }
}
