package com.liucyi.mvcapp.dao;

import java.util.List;

import com.liucyi.mvcapp.domain.Customer;

public interface CustomerDAO {

	public List<Customer> getList();

	public void save(Customer customer);

	public Customer getCustomer(Integer id);

	public void delete(Integer id);

	/**
	 * 返回和name相等的记录数
	 * 
	 * @param name
	 * @return
	 */
	public long getCountWithName(String name);

}
