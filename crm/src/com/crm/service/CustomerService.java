package com.crm.service;
import java.util.List;

import com.crm.domain.Customer;

public interface CustomerService {
	// select all data
	public List<Customer> selectAll();
}
