package com.crm.dao;
import java.util.List;

import com.crm.domain.Customer;

public interface CustomerMapper {
	// select all data
	public List<Customer> selectAll();
	// insert a customer
	public void insert(Customer customer);
}
