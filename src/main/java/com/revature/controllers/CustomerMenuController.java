package com.revature.controllers;

import java.util.Scanner;

import com.revature.models.Customer;
import com.revature.services.Services;
import com.revature.controllers.Login;
import com.revature.daos.DAO;
import com.revature.daos.DAOImp;


public class CustomerMenuController {

	Scanner scan = new Scanner(System.in);
	DAO dao = new DAOImp();
	int id;
	Customer customer = dao.getCustomerById(id);
	double balance;
	Services service = new Services();
	double previousTransaction;
	int years;
	
	
	public void customerMenu(int id) {
		
		System.out.println("Enter Username: ");
		String username = scan.nextLine().trim();
		
		
		System.out.println("\nEnter Password: ");
		String password = scan.nextLine().trim();
	

		do{ 
		System.out.println("Welcome to your account " + "\n 1. Deposit" + "\n 2. Check Balance " + "\n 3. Withdraw" + "\n 4. View Previous Transaction" + "\n 5. Calculate Interest" + "\n 6. View Account Info " + "\n 7. Exit");
		int choice = scan.nextInt();
		
		 
		
	
		switch(choice) {
		
		case 1:
			
			System.out.println("Deposit amount: ");
			double amount = scan.nextDouble();
			balance = balance + amount;
			previousTransaction = amount;
			System.out.println("Your balance is:" + balance);
			
			break;
			
		case 2:
			
			System.out.println("Your balance is: " + balance);
            break;
		
		case 3:
			
			System.out.println("Withdrawal amount: ");
			amount = scan.nextDouble();
			
		
			
			if(amount > balance) {
				
				System.out.println("Insufficient funds, try another amount");
				
			}else {
				
				balance = balance - amount;
				previousTransaction = -amount;
				System.out.println("Your balance is " + balance);
			
				break;
				
			}
			
		case 4:
			
			if(previousTransaction > 0) {
				System.out.println("Deposited: " + previousTransaction);
			} else if (previousTransaction < 0) {
				System.out.println("Withdrawn: " + Math.abs(previousTransaction));
			} else {
				System.out.println("No Transaction occured");
			}
			break;
			
		case 5:
			
			System.out.println("Enter number of years: ");
			years = scan.nextInt();
			double interestRate = 0.05;
			double newBalance = (balance * interestRate * years) + balance;
			System.out.println("The current interest rate is " + (100 * interestRate) + "%");
			System.out.println("After " + years + " years, your balance will be: " + newBalance);
			break;

			
		
		case 6:
			 
			System.out.println("Enter Customer ID: ");						
			int c = scan.nextInt();
			DAO aDao = new DAOImp();
			Customer a = aDao.getCustomerById(c);
			System.out.println(a);
			System.out.println("Here is your customer: \n" + a);	
			break;
			
			
		case 7:
			
			System.out.println("Thank you for using our services!");
			Login login = new Login();
			login.LoginMenu();
			
			
		default: 
			
			System.out.println("Invalid Entry");
			
		}
		}
		
		while (true);
		
		
			
			
	



}

	

}
