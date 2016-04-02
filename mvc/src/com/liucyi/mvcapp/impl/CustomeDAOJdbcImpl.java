package com.liucyi.mvcapp.impl;

import java.util.List;

import com.liucyi.mvcapp.dao.CustomerDAO;
import com.liucyi.mvcapp.dao.DAO;
import com.liucyi.mvcapp.domain.Customer;

public class CustomeDAOJdbcImpl extends DAO<Customer> implements CustomerDAO {

	@Override
	public List<Customer> getList() {
		String sql = "select *from customers";
		return getForList(sql);

	}

	@Override
	public void save(Customer customer) {
		String sql = "insert into customers  (name, address, phone)   values (?,?,?)";
		update(sql);
	}

	@Override
	public Customer getCustomer(Integer id) {
		String sql = "select * from customers where id=?";

		return get(sql, id);
	}

	@Override
	public void delete(Integer id) {
		String sql = "delete from  customers where id=?";
		update(sql, id);
	}

	@Override
	public long getCountWithName(String name) {
		String sql = "select count(id) from customers where name=?";
		return getForValue(sql, name);
	}

}
