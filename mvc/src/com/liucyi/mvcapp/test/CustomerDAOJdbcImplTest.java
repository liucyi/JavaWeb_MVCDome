package com.liucyi.mvcapp.test;

import com.liucyi.mvcapp.dao.*;
import com.liucyi.mvcapp.domain.Customer;
import com.liucyi.mvcapp.impl.CustomeDAOJdbcImpl;

import static org.junit.Assert.fail;

import org.junit.Test;

public class CustomerDAOJdbcImplTest {
	private CustomerDAO customerDao = new CustomeDAOJdbcImpl();

	@Test
	public void testReleaseConnection() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetConnection() {
		fail("Not yet implemented");
	}

	@Test
	public void testObject() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetClass() {
		fail("Not yet implemented");
	}

	@Test
	public void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	public void testEquals() {
		fail("Not yet implemented");
	}

	@Test
	public void testClone() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testNotify() {
		fail("Not yet implemented");
	}

	@Test
	public void testNotifyAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testWaitLong() {
		fail("Not yet implemented");
	}

	@Test
	public void testWaitLongInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testWait() {
		fail("Not yet implemented");
	}

	@Test
	public void testFinalize() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetInteger() {

		Customer customer = customerDao.getCustomer(2);
		System.out.println(customer);
	}

	@Test
	public void testSave() {
		Customer customer = new Customer();
		customer.setId(1);
		customer.setAddress("3232");
		customer.setName("liucyi");
		customer.setPhone("110");
		customerDao.save(customer);
	}

}
