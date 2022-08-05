package com.revature;

import java.util.Scanner;

public class Admin {
	
	Scanner scanner = new Scanner(System.in);

	public void Admin() {
		System.out.println("Welcome, Choose from menu options");
		System.out.println("A. Approve accounts");
		System.out.println("B. Withdraw");
		System.out.println("C. Deposit");
		System.out.println("D. Transfer");
		System.out.println("E. Cancel accounts");
		
	char a = scanner.next().charAt(0);
	
	switch(a) {
	
	case 'A':
	
		System.out.println("Select accounts to Approve:");
	
	break;
	
	case 'B':
		
		System.out.println("Select accounts to withdraw from:");
		
	break;
	
	case 'C':
		
		System.out.println("Select accounts to deposit to: ");
	
	break;
	
	case 'D':
		
		System.out.println("Select accounts for transfer:");
		
	break;
	
	case 'E':
		
		System.out.println("Select accounts to cancel");
	
	break;
	}
	}
}
