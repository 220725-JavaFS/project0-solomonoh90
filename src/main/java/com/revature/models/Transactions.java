package com.revature.models;

import java.sql.Date;
import java.util.Objects;

public class Transactions {

	private int transactionID;
	private String date;
	private double amount;
	private int accountID;
	private String status;
	
	public Transactions(int transactionID, String date, double amount, int accountID, String status) {
		super();
		this.transactionID = transactionID;
		this.date = date;
		this.amount = amount;
		this.accountID = accountID;
		this.status = status;
	}
	
	

	

	public Transactions(String date, double amount, int accountID, String status) {
		super();
		this.date = date;
		this.amount = amount;
		this.accountID = accountID;
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

	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		accountID = accountID;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountID, transactionID, amount, date, status);
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
		return accountID == other.accountID && transactionID == other.transactionID
				&& Double.doubleToLongBits(amount) == Double.doubleToLongBits(other.amount)
				&& Objects.equals(date, other.date) && Objects.equals(status, other.status);
	}

	@Override
	public String toString() {
		return "Transactions [TransactionID=" + transactionID + ", date=" + date + ", amount=" + amount + ", AccountID="
				+ accountID + ", status=" + status + "]";
	}
	
	
	
	
}
