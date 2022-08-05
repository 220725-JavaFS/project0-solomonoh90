package com.revature;

import java.util.Scanner;

public class Register {

Scanner scanner = new Scanner(System.in);
	
public void Register() {
		// TODO Auto-generated method stub
		System.out.println("Please Type First Name:");
		String firstName = scanner.nextLine();
		
		System.out.println("Please Type Last Name:");
		String lastName = scanner.nextLine();
		
		System.out.println("Please Type Email Address:");
		String email = scanner.nextLine();
		
		System.out.println("Please Type Password:");
		String password = scanner.nextLine();
		
		System.out.println("Thank You!");
	}

	
}
