package com.revature.models;

import java.util.Objects;




public class Account {

	private int AccountID;
	private String accounttype;
	private double balance;
	private String accountstatus;
	private boolean approved = false;
	
	public Account(int accountID, String accounttype, double balance, String accountstatus, boolean approved) {
		super();
		AccountID = accountID;
		this.accounttype = accounttype;
		this.balance = balance;
		this.accountstatus = accountstatus;
		this.approved = approved;
	}

	public Account() {
		super();
	}
	

	public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}

	public int getAccountID() {
		return AccountID;
	}

	public void setAccountID(int accountID) {
		AccountID = accountID;
	}

	public String getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountstatus() {
		return accountstatus;
	}

	public void setAccountstatus(String accountstatus) {
		this.accountstatus = accountstatus;
	}



	@Override
	public int hashCode() {
		return Objects.hash(AccountID, accountstatus, accounttype, balance, approved);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return AccountID == other.AccountID && Objects.equals(accountstatus, other.accountstatus)
				&& Objects.equals(accounttype, other.accounttype)
				&& Double.doubleToLongBits(balance) == Double.doubleToLongBits(other.balance)
				&& Objects.equals(approved, other.approved);
	}

	@Override
	public String toString() {
		return "Account [AccountID=" + AccountID + ", accounttype=" + accounttype + ", balance=" + balance
				+ ", accountstatus=" + accountstatus + ", dateopened=" + approved + "]";
	}
	
	
	
	
		
}
