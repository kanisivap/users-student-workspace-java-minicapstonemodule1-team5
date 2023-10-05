package com.techelevator;


import org.w3c.dom.ls.LSOutput;

import java.io.File;

public class VendingMachineCLI {


	public VendingMachineCLI() {

	}

	public void run() {
		System.out.println("Hello world!");
	}

	public static void main(String[] args) {
		VendingMachine mrVends = new VendingMachine();
		mrVends.run();

	}



}
