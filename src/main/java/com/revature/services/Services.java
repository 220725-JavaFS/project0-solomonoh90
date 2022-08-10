package com.revature.services;

import java.util.List;

import com.revature.daos.DAO;
import com.revature.daos.DAOImp;
import com.revature.models.Customer;
import com.revature.models.Transactions;


public class Services {
	
	DAO adao = new DAOImp();
	
	public Customer getCustomer(int id) {
		return adao.getCustomerById(id);
	}

	public Transactions getTransaction(int id) {
		return adao.getTransactionByID(id);
		
	}
	
	public Customer deleteCustomer(int id) {
		return adao.deleteCustID(id);
	}
	
	public List<Customer> getAllCustomers(){
		return adao.getAllCustomers();
	}
	
	public void insertCustomer(Customer customer) {
		adao.insertCustomer(customer);
	}
	
}

	
