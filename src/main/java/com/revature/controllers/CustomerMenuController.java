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
	double balance = 0;
	
	
	public void customerMenu(int id) {
		
		System.out.println("Enter Username: ");
		String username = scan.nextLine().trim();
		
		System.out.println("Enter Password: ");
		String password = scan.nextLine().trim();
	

		do{ 
		System.out.println("Welcome to your account " + "\n 1. Deposit" + "\n 2. Check Balance " + "\n 3. Withdraw" + "\n 4. View Account Info " + "\n 5. Exit");
		int choice = scan.nextInt();
		
		 
		
	
		switch(choice) {
		
		case 1:
			
			System.out.println("Deposit amount: ");
			double deposit = scan.nextDouble();
			balance = balance + deposit;
			dao.updateBalance(balance, id);
			System.out.println("Your balance is:" + balance);
			break;
			
		case 2:
			
			System.out.println("Your balance is: " + balance);
            break;
		
		case 3:
			
			System.out.println("Withdrawal amount: ");
			double withdraw = scan.nextDouble();
			
		
			
			if(withdraw > balance) {
				
				System.out.println("Insufficient funds, try another amount");
				
			}else {
				
				balance = balance - withdraw;
				dao.updateBalance(balance, id);
				System.out.println("Your balance is " + balance);
				break;
				
			}
			
		
		case 4:
			 
			System.out.println("Enter Customer ID: ");						
			int c = scan.nextInt();
			DAO aDao = new DAOImp();
			Customer a = aDao.getCustomerById(c);
			System.out.println(a);
			System.out.println("Here is your customer: \n" + a);	
			break;
			
			
		case 5:
			
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
