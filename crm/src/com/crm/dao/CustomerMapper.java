package com.crm.dao;
import java.util.List;

import com.crm.domain.Customer;

public interface CustomerMapper {
	// select all data
	public List<Customer> selectAll();
	// insert a customer
	public void insert(Customer customer);
	// update a customer
	public void update(Customer customer);
	// find by id
	public Customer findById(Integer id);
	// delete
	public void delete(Integer[] id);
}
