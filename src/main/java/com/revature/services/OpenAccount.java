package com.revature.services;

import java.util.Scanner;

import com.revature.controllers.Login;
import com.revature.daos.DAO;
import com.revature.daos.DAOImp;
import com.revature.models.Customer;

public class OpenAccount {
	
	Customer customer = new Customer();
	
	static Scanner Scan = new Scanner(System.in);
	
	
	public void createAccount() {
		
		Customer customer = new Customer();
		
		System.out.println("Please enter name: \n ");
		customer.setName(Scan.nextLine().trim());
		
		System.out.println("Please enter email \n ");
		customer.setEmail(Scan.nextLine().trim());
		
		
		System.out.println("Would you like to open a checking or savings account? \n");
		customer.setacccountType(Scan.nextLine().trim());
		
		
		
		System.out.println("Create username: \n");
		customer.setUsername(Scan.nextLine());
		
		
		System.out.println("Create password \n");
		String password1 = Scan.nextLine().trim();
		
		System.out.print("Confirm password: \n ");
		String password2 = Scan.nextLine().trim();
		
		if (!password1.equals(password2)) {
			
			System.out.println("Paswords do not match, Please type again.");
			
		} else {
			
			System.out.println("Congratulations on opening a new account ");
			Services service = new Services();
			service.insertCustomer(customer);
			Login login = new Login();
			login.LoginMenu();
		
		}
			

			
			
	
		
		
		
		
	}
	


	 




}
