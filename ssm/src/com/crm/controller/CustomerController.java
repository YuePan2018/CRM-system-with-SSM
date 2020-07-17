package com.crm.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.domain.Customer;
import com.crm.service.CustomerService;


@Controller
@RequestMapping("/customer")
public class CustomerController {
	// inject a CustomerService object
	@Resource
	private CustomerService customerService;
	// jump to input page (input.jsp)
	@RequestMapping("/input")
	public String input(){
		return "input";
	}
	// insert in database and jump to success page (succ.jsp)
	@RequestMapping("/save")
	public String save(Customer customer){
		customerService.insertCustomer(customer);
		return "succ";
	}
}
