package com.techelevator;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private BigDecimal balance;
    List<Slot> inventory = new ArrayList<Slot>();
    private final int slotSize = 5;
    private final String path = "vendingmachine.csv";
    private File inputFile = new File(path);

    public void run() {

    }

    public void populate(File inputFile) {

    }
 }
