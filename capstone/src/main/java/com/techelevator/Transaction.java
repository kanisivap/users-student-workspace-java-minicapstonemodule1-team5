package com.techelevator;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public abstract class Transaction {

    private String message;
    private LocalDateTime dateAndTime;
    private BigDecimal transactionAmount;
    private BigDecimal balance;

    public Transaction(String message, BigDecimal transactionAmount, BigDecimal balance) {
        this.message = message;
        this.transactionAmount = transactionAmount;
        this.balance = balance;
        this.dateAndTime = LocalDateTime.now();
    }

    public String getLogEntry() {
        String logMessage = dateAndTime + " " + message + " " + transactionAmount + " " + balance;
        return logMessage;
    }

}
