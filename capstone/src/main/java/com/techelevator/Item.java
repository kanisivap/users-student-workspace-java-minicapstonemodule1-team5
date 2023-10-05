package com.techelevator;

import java.math.BigDecimal;

public abstract class Item {

    private String name;
    private BigDecimal price;
    private String message;



    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public abstract String getMessage();

    public Item(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public Item(){}

}
