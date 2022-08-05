package com.revature;

import java.util.Scanner;

public class main {
	
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hello, Welcome to Big Baller Bank!");
		System.out.println("Do you have an account? (Y or N)");
		
		String user1 =scanner.nextLine();
		user1 = user1.toLowerCase();
		
	    switch(user1) {
	    case "y":
	    	Login login = new Login();
			login.Login();
			break;
	    	
	    case "n":
	    	Register account1 = new Register();
	    	account1.Register();
	    	break;
	    }
	}

}
