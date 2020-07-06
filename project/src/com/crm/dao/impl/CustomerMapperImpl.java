package com.crm.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.crm.dao.CustomerMapper;
import com.crm.domain.Customer;

public class CustomerMapperImpl extends SqlSessionDaoSupport implements CustomerMapper {
	// sqlsessionFactory is injected by applicationContext.xml
	public void insertCustomer(Customer customer) {		
		SqlSession sqlSession = this.getSqlSession();	// factory.getSession
		sqlSession.insert("insertCustomer",customer);
		// don't need submit() because spring will do it
	}

}
