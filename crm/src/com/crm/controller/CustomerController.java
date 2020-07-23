package com.crm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	
	// return customer by id
	@RequestMapping("/findById")
	@ResponseBody
	public Customer findById(Integer id){
		Customer cust = customerService.findById(id);
		return cust;
	}

	//result is a return value which contains status and message, and it's a map.
	private Map<String,Object> result = new HashMap<String,Object>();
	// save: insert or update
	@RequestMapping("/save")
	@ResponseBody
	public Map<String,Object> save(Customer customer){
		// the form submitted from web is transformed to a Customer Object
		try {
			customerService.save(customer);
			result.put("success", true);
		} catch (Exception e) {
			e.printStackTrace();
			result.put("success", false);
			result.put("msg", e.getMessage());
		}
		return result;
	}
	// delete
	@RequestMapping("/delete")
	@ResponseBody
	// receive idStr from jsp as Integer[]
	public Map<String,Object> delete(Integer[] id){
		try {
			customerService.delete(id);
			result.put("success", true);
		} catch (Exception e) {
			e.printStackTrace();
			result.put("success", false);
			result.put("msg", e.getMessage());
		}
		return result;
	}
}
