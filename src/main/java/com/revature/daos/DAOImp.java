package com.revature.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.Customer;
import com.revature.models.Transactions;
import com.revature.utils.ConnectionUtil;

public class DAOImp implements DAO {

	
	@Override
	public Customer getCustomerById(int id) {
		try (Connection conn = ConnectionUtil.getConnection()) {
			String sql = "SELECT * FROM customer_info WHERE customer_id = " + id + ";";
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);

			if (result.next()) {
				Customer customer = new Customer(result.getInt("customer_id"), result.getString("customer_name"),
						result.getString("customer_email"), result.getString("customer_username"),
						result.getDouble("customer_balance"), result.getString("account_type"), null

				);
				
				

				return customer;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		DAO aDao = new DAOImp();
		Customer a = aDao.getCustomerById(2);
		System.out.println(a);
	}

	@Override
	public Transactions getTransactionByID(int id) {
		try(Connection conn = ConnectionUtil.getConnection()) {
			String sql = "SELECT * FROM transaction_id WHERE transaction_id = " + id + ";";
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			
			if(result.next()) {//resultSets have cursors. .next(); is called to move cursor to next group of values
				Transactions newTrans = new Transactions(
				result.getInt("transaction_id"), 
				result.getString("transaction_date"), 
	            result.getDouble("transaction_amount"), 
	            result.getInt("customer_id"), 
	            result.getString("customer_email"), 
	            result.getString("transaction_status")
	        	
	            );
				return newTrans;
			}
			
		} catch (SQLException e) {
			System.out.println("There was an SQL exception");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Customer deleteCustID(int id) {
		try (Connection conn = ConnectionUtil.getConnection()) {
			String sql = "DELETE FROM customer_info WHERE customer_id = " + id + ";";
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void updateBalance(double balance, int id) {
		try (Connection conn = ConnectionUtil.getConnection()) {
			String sql = "UPDATE customer_info SET customer_balance = " + balance + " WHERE customer_id = " + id + ";";
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<Customer> getAllCustomers() {
		try (Connection conn = ConnectionUtil.getConnection()) {
			String sql = "SELECT * FROM customer_info;";
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);

			List<Customer> customerList = new ArrayList<Customer>();

			while (result.next()) { // resultSets are cursor based, each time .next is called the cursor moves to
									// the next group of values.
				// It starts one before so you always need to call next.
				Customer customer = new Customer(result.getInt("customer_id"), result.getString("customer_name"),
						result.getString("customer_username"), result.getString("customer_password"),
						result.getDouble("customer_balance"), result.getString("account_type"), null);

				customerList.add(customer);
			}

			return customerList;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void insertCustomer(Customer customer) {
		try (Connection conn = ConnectionUtil.getConnection()) {
			String sql = "INSERT INTO customer_info (customer_name, customer_email, customer_username, customer_password, account_type) "
				
					+ " VALUES (?, ?, ?, ?, ?);";

			PreparedStatement statement = conn.prepareStatement(sql);

			int count = 1;
			statement.setString(count++, customer.getName());
			statement.setString(count++, customer.getEmail());
			statement.setString(count++, customer.getUsername());
			statement.setString(count++, customer.getPassword());
			statement.setString(count++, customer.getaccountType());
		

			statement.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}



	@Override
	public Customer getCustomerbyemail() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomerByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	
	



}
