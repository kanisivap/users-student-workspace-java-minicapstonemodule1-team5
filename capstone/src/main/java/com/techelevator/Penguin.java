package com.techelevator;

import java.math.BigDecimal;

public class Penguin extends Item{

    private final String message;

    public Penguin(String name, BigDecimal price, String message) {
        super(name,price);
        this.message = message;
    }

    public String getMessage(String message) {
        return this.message;
    }
}