package com.crm.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.crm.dao.CustomerMapper;
import com.crm.domain.Customer;

public class MybatisSpringTest {
	@Test
	public void test(){
		//1. load spring configuration
		ApplicationContext ac = new	ClassPathXmlApplicationContext("applicationContext.xml");
		//2. get bean object (implementation class)
		CustomerMapper customerMapper = (CustomerMapper)ac.getBean("customerMapper");
		//3. set argument object
		Customer customer = new Customer();
		customer.setName("Chen");
		customer.setGender("M");
		customer.setTelephone("020-666666");
		customer.setAddress("GuangZhou");
		//4. call methods implementation class
		customerMapper.insertCustomer(customer);
	}
}
