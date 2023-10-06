package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public abstract class Transaction {

    private String message;
    private LocalDateTime dateAndTime;
    private BigDecimal transactionAmount;
    private BigDecimal balance;
    private DateFormat dateTimeFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss aa");

   public Transaction() {

   }

    public Transaction(String message, BigDecimal transactionAmount, BigDecimal balance) {
        this.message = message;
        this.transactionAmount = transactionAmount;
        this.balance = balance;
        this.dateAndTime = LocalDateTime.now();
    }

    public String getLogEntry() {
        String dateTimeString = dateTimeFormat.format(new Date());
        return dateTimeString + " " + message + " $" + transactionAmount + " $" + balance;
    }

    public void logEntry(File logFile) throws FileNotFoundException {

       try (PrintWriter pw = new PrintWriter(new FileOutputStream(logFile, true))) {
            pw.println(this.getLogEntry());
       }


    }

}
