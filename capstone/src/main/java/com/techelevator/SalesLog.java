package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class SalesLog {

    private List<Purchase> purchaseList = new ArrayList<>();

    public void addPurchase(Purchase purchase) {

        this.purchaseList.add(purchase);

    }



}
