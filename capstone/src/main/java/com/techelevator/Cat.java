package com.techelevator;

import java.math.BigDecimal;

public class Cat extends Item{

    private final String message = "Meow, Meow, Meow!";

    public Cat(String name, BigDecimal price) {
        super(name, price);
    }
}