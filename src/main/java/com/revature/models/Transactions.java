package com.revature.models;

import java.sql.Date;
import java.util.Objects;

public class Transactions {

	private int transactionID;
	private String date;
	private double amount;
	private int customerID;
	private String email;
	private String status;
	
	public Transactions(int transactionID, String date, double amount, int customerID, String email, String status) {
		super();
		this.transactionID = transactionID;
		this.date = date;
		this.amount = amount;
		this.customerID = customerID;
		this.email = email;
		this.status = status;
	}
	
	

	

	public Transactions(String date, double amount, int customerID, String email, String status) {
		super();
		this.date = date;
		this.amount = amount;
		this.customerID = customerID;
		this.email = email;
		this.status = status;
	}





	public int getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(int transactionID) {
		transactionID = transactionID;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getcustomerID() {
		return customerID;
	}

	public void setcustomerID(int accountID) {
		customerID = customerID;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		return Objects.hash(customerID, transactionID, amount, date, status);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transactions other = (Transactions) obj;
		return customerID == other.customerID && transactionID == other.transactionID
				&& Double.doubleToLongBits(amount) == Double.doubleToLongBits(other.amount)
				&& Objects.equals(date, other.date) && Objects.equals(status, other.status);
	}

	@Override
	public String toString() {
		return "Transactions [TransactionID=" + transactionID + ", date=" + date + ", amount=" + amount + ", customerID="
				+ customerID + ", email =" + email + ", status=" + status + "]";
	}
	
	
	
	
}
