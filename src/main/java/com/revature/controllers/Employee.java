package com.revature.controllers;

import java.util.Scanner;

import com.revature.daos.DAO;
import com.revature.daos.DAOImp;

import com.revature.models.Customer;
import com.revature.models.Transactions;
import com.revature.services.OpenAccount;
import com.revature.services.Services;

public class Employee {
	
	Scanner scan = new Scanner(System.in);	
	DAO dao = new DAOImp();

	public void employeeMenu() {
					
			do{ 
				System.out.println("Welcome to your account " + "\n 1. Add Customer" + "\n 2. Search Customer " + "\n 3. View Transactions " +  "\n 4. Exit");
			
			int choice = scan.nextInt();
			
				switch (choice) {		
			
				case 1:		
					
					OpenAccount newAccount = new OpenAccount();
					newAccount.createAccount();
					break;
					
				case 2: 						
					System.out.println("Enter Customer ID: ");						
					int c = scan.nextInt();
					DAO aDao = new DAOImp();
					Customer a = aDao.getCustomerById(c);
					System.out.println(a);	
					break;
					 	
				
				case 3: 
					
					System.out.println("Enter Transaction ID: ");						
					int id1 = scan.nextInt();			
					
					DAO dao1 = new DAOImp();
					Transactions transaction = dao1.getTransactionByID(id1);
					System.out.println("Here is your Transaction: \n" + transaction);	
					break;			
											
				case 4: 
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
