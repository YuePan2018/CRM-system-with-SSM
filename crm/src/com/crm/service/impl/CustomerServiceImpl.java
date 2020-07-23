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
	// save a customerL insert or edit
	public void save(Customer customer) {
		// insert
		if(customer.getId() == null){
			customerMapper.insert(customer);
		// update
		}else{
			customerMapper.update(customer);
		}
	}
	// find by id
	public Customer findById(Integer id) {
		return customerMapper.findById(id);
	}
	// delete
	public void delete(Integer[] id) {
		customerMapper.delete(id);		
	}
}
