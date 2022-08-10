package com.revature.daos;

import java.util.List;

import com.revature.models.Customer;
import com.revature.models.Transactions;

public interface DAO {

		public abstract Customer getCustomerById(int id);

		public abstract Transactions getTransactionByID(int id);

		public abstract Customer deleteCustID(int id);

		public abstract void updateBalance(double balance, int id);

		List<Customer> getAllCustomers();

		public abstract void insertCustomer(Customer customer);

		public abstract Customer getCustomerByEmail(String email);

		Customer getCustomerbyemail();

}
