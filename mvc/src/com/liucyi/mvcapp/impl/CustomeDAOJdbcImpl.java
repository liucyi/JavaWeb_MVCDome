package com.liucyi.mvcapp.impl;

import java.util.List;

import com.liucyi.mvcapp.dao.CustomerDAO;
import com.liucyi.mvcapp.dao.DAO;
import com.liucyi.mvcapp.domain.Customer;

public class CustomeDAOJdbcImpl extends DAO<Customer> implements CustomerDAO {

	@Override
	public List<Customer> getList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub

	}

	@Override
	public Customer getCustomer(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public long getCountWithName(String name) {
		// TODO Auto-generated method stub
		return 0;
	}

}
