package com.crm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crm.dao.CustomerMapper;
import com.crm.domain.Customer;
import com.crm.service.CustomerService;

@Service("customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService {
	@Resource
	private CustomerMapper customerMapper;
	public void insertCustomer(Customer customer) {
		customerMapper.insertCustomer(customer);
	}
}
