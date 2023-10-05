package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {
    private BigDecimal balance;
    List<Slot> inventory = new ArrayList<Slot>();
    private final int slotSize = 5;
    private final String path = "vendingmachine.csv";
    private File inputFile = new File(path);

    public void run() throws FileNotFoundException {

        this.populate();

        Scanner userInput = new Scanner(System.in);

        while (true) {
            System.out.println("(1) Display Vending Machine Items");
            System.out.println("(2) Purchase");
            System.out.println("(3) Exit");
            int choice = userInput.nextInt();

            if (choice == 1) {
                for (Slot slot : inventory) {

                    System.out.println(slot.toString());

                }
            } else if (choice == 2) {

            } else if (choice == 3) {
                System.out.println("Byeeeee");
                System.exit(0);
            } else if (choice == 4) {

            }
        }

    }

    private void purchaseMenu() {
        
    }

    private void populate() throws FileNotFoundException {

        try (Scanner reader = new Scanner(inputFile)) {
            while (reader.hasNextLine()) {

                Slot newSlot;
                Item newItem = null;
                String[] lineArray = reader.nextLine().split("\\|");
                String type = lineArray[3];
                BigDecimal price = new BigDecimal(lineArray[2]);
                String name = lineArray[1];
                String slotNumber = lineArray[0];

                if (type.equals("Duck")) {
                    newItem = new Duck(name, price);
                } else if (type.equals("Pony")) {
                    newItem = new Pony(name, price);
                } else if (type.equals("Cat")) {
                    newItem = new Cat(name, price);
                } else if (type.equals("Penguin")) {
                    newItem = new Penguin(name, price);
                }

                newSlot = new Slot(slotNumber, newItem);

                inventory.add(newSlot);
            }
        }
    }
 }
