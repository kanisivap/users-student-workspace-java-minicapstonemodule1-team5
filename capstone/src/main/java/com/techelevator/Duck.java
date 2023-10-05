package com.techelevator;

import java.math.BigDecimal;

public class Duck extends Item{

    private final String message = "Quack, Quack, Splash!";

    public Duck(String name, BigDecimal price) {
        super(name, price);
    }

    public String getMessage() {
        return this.message;
    }
}
