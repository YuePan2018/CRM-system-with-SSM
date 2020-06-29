package com.crm.test;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.crm.dao.CustomerMapper;
import com.crm.domain.Customer;

public class MybatisTest {
	@Test
	public void test() throws Exception{
	SqlSessionFactoryBuilder builer = new SqlSessionFactoryBuilder();
	InputStream is = Resources.getResourceAsStream("sqlMapConfig.xml");
	SqlSessionFactory factory = builer.build(is);
	
	SqlSession sqlSession = factory.openSession();
	CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
	
	Customer customer = new Customer();
	customer.setName("小张");
	customer.setGender("男");
	customer.setTelephone("020-3333333");
	customer.setAddress("广州天河广场");
	customerMapper.insertCustomer(customer);
	
	sqlSession.commit();
	sqlSession.close();
	}
	
}
