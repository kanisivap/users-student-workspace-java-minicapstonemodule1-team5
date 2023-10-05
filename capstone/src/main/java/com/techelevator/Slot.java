package com.techelevator;

import java.math.BigDecimal;

public class Slot {

    private String slotNumber;
    private Item item;
    private int stock;

    public String getSlotNumber() {
        return slotNumber;
    }
    public Item getItem() {
        return item;
    }
    public int getStock() {
        return stock;
    }

    public BigDecimal getPrice() {
        return this.item.getPrice();
    }

    public Slot() {}

    public Slot(String slotNumber, Item item) {
        this.slotNumber = slotNumber;
        this.item = item;
        this.stock = 5;
    }

    public boolean sell() {

        if(stock > 0) {
            this.stock--;
            return true;
        }

        System.out.println("Out of stock :(");
        return false;
    }

    public String toString() {
        String price = item.getPrice().toString();
        return String.format("%s: %s ($%s)", slotNumber, item.getName(), price);
    }

}
