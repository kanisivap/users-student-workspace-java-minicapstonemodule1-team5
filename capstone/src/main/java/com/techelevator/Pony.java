package com.techelevator;

import java.math.BigDecimal;

public class Pony extends Item{

    private final String message = "Neigh, Neigh, Yay!";

    public Pony(String name, BigDecimal price) {
        super(name,price);
    }

    public String getMessage() {
        return this.message;
    }

}