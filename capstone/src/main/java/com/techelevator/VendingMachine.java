package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {
    private BigDecimal balance = BigDecimal.valueOf(0);
    List<Slot> inventory = new ArrayList<Slot>();
    private final int slotSize = 5;
    private final String path = "vendingmachine.csv";
    private File inputFile = new File(path);
    private Scanner userInput = new Scanner(System.in);

    public void run() throws FileNotFoundException {

        this.populate();

        while (true) {
            System.out.println("(1) Display Vending Machine Items");
            System.out.println("(2) Purchase");
            System.out.println("(3) Exit");
            String choice = userInput.next();

            if (choice.equals("1")) {
                for (Slot slot : inventory) {

                    System.out.println(slot.toString());

                }
                System.out.println();
            } else if (choice.equals("2")) {
                purchaseMenu();
            } else if (choice.equals("3")) {
                System.out.println("Byeeeee");
                System.exit(0);
            } else if (choice.equals("4")) {

            }
        }

    }

    private void purchaseMenu() {
        while (true) {
            System.out.println(String.format("Current Balance: $%s", balance.toString()));
            System.out.println();
            System.out.println("(1) Feed Money");
            System.out.println("(2) Select Product");
            System.out.println("(3) Finish Transaction");
            String choice = userInput.next();

            if (choice.equals("1")) {
                deposit();
            } else if (choice.equals("2")) {
                System.out.println("Enter slot number: ");
                String slotChoice = userInput.next();
                buy(slotChoice);
            } else if (choice.equals("3")) {
                giveChange();
                break;
            }
        }
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

    private boolean buy(String slotNumber) {

        Slot slotToBuy = null;
        boolean transactionSuccessful = false;

        for (Slot slot : inventory) {
            if (slot.getSlotNumber().equalsIgnoreCase(slotNumber)) {
                slotToBuy = slot;
            }
        }

        if (slotToBuy == null) {
            System.out.println("Item not found.");
            return transactionSuccessful;
        }

        if (isBalanceEnough(slotToBuy)) {

            transactionSuccessful = slotToBuy.sell();
            Item itemToBuy = slotToBuy.getItem();
            balance = balance.subtract(slotToBuy.getPrice());
            System.out.printf("You bought %s for $%s! %s%n", itemToBuy.getName(), itemToBuy.getPrice(), itemToBuy.getMessage());
            System.out.printf("Remaining balance: $%s%n", balance.toString());
            System.out.println("-----");
            System.out.println();

        } else {
            System.out.println("Insufficient Balance.");
            System.out.println("More funds needed: $" + (slotToBuy.getPrice().subtract(balance)));
        }

        return transactionSuccessful;

    }

    private void deposit() {
        while (true) {
            System.out.println("How much to deposit?");
            BigDecimal amount = userInput.nextBigDecimal();
            BigDecimal minDeposit = BigDecimal.valueOf(0);

            if (amount.compareTo(minDeposit) >= 0) {
                balance = balance.add(amount);
                break;
            } else {
                System.out.println("Invalid amount");
            }
        }
    }

    private boolean isBalanceEnough(Slot slot) {

        if (balance.compareTo(slot.getPrice()) >= 0) {
            return true;
        }

        return false;

    }

    public void giveChange() {
        if(balance.compareTo(BigDecimal.valueOf(0)) > 0) {
            balance = balance.multiply(BigDecimal.valueOf(100));
            int changeDue = (balance.intValue());
            int quarter = changeDue / 25;
            changeDue = changeDue % 25;
            int dime = changeDue / 10;
            changeDue = changeDue % 10;
            int nickel = changeDue / 5;
            changeDue = changeDue % 5;
            int penny = changeDue;
            System.out.println(String.format("Your change is: %d quarters, %d dimes, %d nickels, and %d pennies.", quarter, dime, nickel, penny));
            balance = BigDecimal.valueOf(0);
        }
    }

 }
