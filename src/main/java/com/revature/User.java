package com.revature;

import java.util.Scanner;

public class User {
	static Scanner scanner = new Scanner(System.in);
	public int a = 2;
	static int balance;
	public User (String firstName, String lastName, String password) {
	
	}

	public int getA() {
		return a;
	}
	public void setA(int a) { 
		this.a = a;
	}
	
	public static void Menu() {
		System.out.println("Welcome Choose from following:");
		System.out.println("A: Check Balance");
		System.out.println("B: Deposit");
		System.out.println("C: Withdraw");
		System.out.println("D: Transfer");
		
		char c = scanner.next().charAt(0);
		
		switch(c) {
		
		case 'A':
			System.out.println("Your balance is: " + balance);
			Menu();
		case 'B':
			System.out.println("Deposit amount:");
			int deposit = scanner.nextInt();
			balance = balance + deposit;
			System.out.println("Your balance is " + balance);
			Menu();
		case 'C':
			System.out.println("Withdrawal amount:");
			int withdraw = scanner.nextInt();
			balance = balance - withdraw;
			System.out.println("Your balance is " + balance);
			Menu();
		case 'D':
			System.out.println("Transfer amount:");
			
		default: 
			System.out.println("Choose another option");
			Menu();
			
		
		}
		
		
	}
}

