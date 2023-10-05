package com.techelevator;

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

    public Slot(String slotNumber, Item item, int stock) {
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

}
