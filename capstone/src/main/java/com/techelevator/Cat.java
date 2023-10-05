package com.techelevator;

import java.math.BigDecimal;

public class Cat extends Item{

    private final String message;

    public Cat(String name, BigDecimal price, String message) {
        super(name, price);
        this.message = message;
    }

    public String getMessage(String message) {
        return this.message;
    }
}