package com.techelevator;

import java.math.BigDecimal;

public class GiveChange extends Transaction{

    public GiveChange(BigDecimal transactionAmount, BigDecimal balance) {

        super(("GIVE CHANGE: "),
                transactionAmount,
                balance);

    }

}
