package com.techelevator;

import java.math.BigDecimal;

public class Deposit extends Transaction{

    public Deposit(BigDecimal transactionAmount, BigDecimal balance) {

        super(("FEED MONEY: "),
                transactionAmount,
                balance);

    }

}
