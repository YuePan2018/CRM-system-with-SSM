package com.crm.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crm.domain.Customer;
import com.crm.service.CustomerService;


@Controller
@RequestMapping("/customer")
public class CustomerController {
	// inject a CustomerService object
	@Resource
	private CustomerService customerService;
	/*
		Returned data is in a json format,
		because datagrid in EasyUI requires json.
		json data structure: [ {id:1,name:xxx},{id:2,name:yyy} ]
	*/
	@RequestMapping("/list")
	@ResponseBody 	// transform returned value type to json
	public List<Customer> list(){
		List<Customer> list = customerService.selectAll();
		return list;
	}
}
