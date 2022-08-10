package com.revature.controllers;

import java.util.Scanner;

import com.revature.daos.DAO;
import com.revature.daos.DAOImp;
import com.revature.models.Account;
import com.revature.models.Customer;
import com.revature.models.Transactions;
import com.revature.services.OpenAccount;
import com.revature.services.Services;

public class Admin {
	
	Scanner scan = new Scanner(System.in);
	int id;

	
	public  void AdminMenu() {
		
		do{ 
			System.out.println("Welcome to your account " + "\n 1. Add Customer" + "\n 2. Delete customer " + "\n 3. Search Customer" + "\n 4. View Transasctions" + "\n 5. Exit" );
		
		int choice = scan.nextInt();
		
		switch(choice) {
		
		case 1:
			
			OpenAccount newAccount = new OpenAccount();
			newAccount.createAccount();
			break;
			
		case 2:
			
			System.out.println("Enter Customer ID: " );
			int id = scan.nextInt();
			DAO aDao = new DAOImp();
			Customer cust = aDao.getCustomerById(id);
			System.out.println("Customer has been deleted");
			aDao.deleteCustID(id);
			break;
		
		
		case 3: 
			
			System.out.println("Enter Customer ID: ");						
			int id1 = scan.nextInt();
			DAO bDao = new DAOImp();
			Customer customer = bDao.getCustomerById(id1);
			System.out.println("Here is your customer: \n" + customer);	
			break;
			
		
		case 4: 
			System.out.println("Enter Transaction ID: ");						
			int id2 = scan.nextInt();			
			
			DAO dao1 = new DAOImp();
			Transactions transaction = dao1.getTransactionByID(id2);
			System.out.println("Here is your Transaction: \n" + transaction);	
			break;
			
		case 5: 
			System.out.println("Thank you for using our System");
			Login login = new Login();
			login.LoginMenu();
			break;
			
		default:
			System.out.println("Invalid option please select again");
			break;
			
		
	}
		}
		
		while(true);
		
		

}

}