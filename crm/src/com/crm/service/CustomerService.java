package com.crm.service;
import java.util.List;

import com.crm.domain.Customer;

public interface CustomerService {
	// select all data
	public List<Customer> selectAll();
	// insert or update a customer
	public void save(Customer customer);
	// find customer by id
	public Customer findById(Integer id);
	// delete customer
	public void delete(Integer[] id);
}
