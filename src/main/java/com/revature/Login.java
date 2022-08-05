package com.revature;

import java.util.Scanner;

public class Login {

	Scanner scanner = new Scanner(System.in);
	Scanner scanner1= new Scanner(System.in);
	String userName;
	String password;
	

	public void Login() {
		// TODO Auto-generated method stub
		System.out.println("Enter Username:");
		scanner.nextLine();
		
		
		System.out.println("Enter Password:");
		scanner1.nextLine();
		
		
		User.Menu();
			
	}




	

}
