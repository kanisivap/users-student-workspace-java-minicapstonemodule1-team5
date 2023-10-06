package com.techelevator;

import java.math.BigDecimal;

public class Purchase extends Transaction {

    private Slot slotPurchased;

    public Purchase(Slot slot, BigDecimal transactionAmount, BigDecimal balance) {

        super((slot.getItem().getName() + " " + slot.getSlotNumber()),
                transactionAmount,
                balance);

    }

}
