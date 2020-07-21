package com.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crm.dao.CustomerMapper;
import com.crm.domain.Customer;
import com.crm.service.CustomerService;

@Service("customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService {
	// inject mybatis mapper
	@Resource
	private CustomerMapper customerMapper;
	// select all data
	public List<Customer> selectAll(){
		return customerMapper.selectAll();
	}
	// insert a customer
	public void insert(Customer customer) {
		customerMapper.insert(customer);
	}
}
