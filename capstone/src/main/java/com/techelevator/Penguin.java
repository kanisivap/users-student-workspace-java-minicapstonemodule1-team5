package com.techelevator;

import java.math.BigDecimal;

public class Penguin extends Item{

    private final String message = "Squawk, Squawk, Whee!";

    public Penguin(String name, BigDecimal price) {
        super(name,price);
    }
}