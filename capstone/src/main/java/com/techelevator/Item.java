package com.techelevator;

import java.math.BigDecimal;

public abstract class Item {

    private String name;
    private BigDecimal price;
    private String message;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Item(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public Item(){}

    public String printMessage(String message) {
        return this.message;
    }

}
