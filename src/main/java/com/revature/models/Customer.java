package com.revature.models;

import java.util.ArrayList;
import java.util.Objects;

public class Customer {
	
	public int CustomerID;
	public String name;
	private String email;
	public String username;
	private double balance;
	private String password;
	private String accountType;
	private ArrayList<Account> accounts = new ArrayList<Account>();
	
	
	public Customer(int CustomerID, String name, String email, String username, double balance, String password, String accountType) {
		super();
		this.CustomerID = CustomerID;
		this.name = name;
		this.username= username;
		this.balance = balance;
		this.password = password;
		this.accountType = accountType;
		this.email = email;
	}


	public Customer(String name, String username, String email, double balance, String password, String accountType) {
		super();
		this.name = name;
		this.username= username;
		this.balance = balance;
		this.password = password;
		this.email = email;
		this.accountType = accountType;
	}

	public Customer(String username, String password, ArrayList<Account>accounts) {
		super();
		this.username = username;
		this.password= password;
		this.accounts = accounts;
	
	}





	



	public Customer() {
		// TODO Auto-generated constructor stub
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCustomerID() {
		return CustomerID;
	}

	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public double getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getaccountType() {
		return accountType;
	}

	public void setacccountType(String accountType) {
		this.accountType = accountType;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public int hashCode() {
		return Objects.hash(CustomerID, balance, username, accountType, name, password);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return CustomerID == other.CustomerID
				&& Double.doubleToLongBits(balance) == Double.doubleToLongBits(other.balance)
				&& Objects.equals(username, other.username) && accountType == other.accountType
				&& Objects.equals(name, other.name) && Objects.equals(password, other.password);
				
	}

	

	@Override
	public String toString() {
		return "Customer [CustomerID=" + CustomerID + ", name=" + name + ", email=" + email + ", username=" + username
				+ ", balance=" + balance + ", password=" + password + ", accountType=" + accountType + ", accounts="
				+ accounts + "]";
	}


	public ArrayList<Account> getAccounts() {
		return accounts;
	}


	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}


	public void setBalance(Class<Integer> class1) {
		// TODO Auto-generated method stub
		
	}





	




	
}

	