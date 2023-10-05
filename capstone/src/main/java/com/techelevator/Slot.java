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
    return false;
    }

    public String toString() {
        String price = item.getPrice().toString();
        return String.format("%s: %s ($%s)", slotNumber, item.getName(), price);
    }

}
