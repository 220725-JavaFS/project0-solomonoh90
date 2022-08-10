package com.revature.controllers;

import java.util.Scanner;

import com.revature.controllers.Admin;
import com.revature.controllers.CustomerMenuController;
import com.revature.controllers.Employee;
import com.revature.models.Customer;
import com.revature.services.OpenAccount;

public class Login {
	Scanner scan = new Scanner(System.in);
	

	

	public void LoginMenu() {
		
		System.out.println("1. Create Account");
		System.out.println("2. Customer Login");
		System.out.println("3. Admin Login");
		System.out.println("4. Employee Login");
		System.out.println("5. Exit");
		
		int choice = scan.nextInt();
		
		switch(choice) {
		
		case 1:
			
			OpenAccount newAccount = new OpenAccount();
			newAccount.createAccount();
			break;
			
		case 2:
			
			CustomerMenuController customer = new CustomerMenuController();
			customer.customerMenu(choice);
			break;
			
		case 3: 
			
			Admin admin = new Admin();
			admin.AdminMenu();
			break;
			
		case 4:
			
			Employee employee = new Employee();
			employee.employeeMenu();
			break;
			
		case 5:
			
			System.out.println("Thank you for using our system");
			scan.close();
			break;
			
		default:
			
			System.out.println("Please select another option");
			break;
			
		}
		
		
}



	
		
	
		
	}
		
	
