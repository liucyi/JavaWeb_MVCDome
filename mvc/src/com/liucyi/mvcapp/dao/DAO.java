package com.liucyi.mvcapp.dao;

import java.util.List;

/*
 * 封装基本的CRUD的方法
 * 当前DAO直接在方法中获取数据库连接
 * 整个DAO才去DButils解决方法
 * 
 * */
public class DAO<T> {

	private Class<T> clazz;

	/**
	 * 返回某一个值
	 * 
	 * @param sql
	 * @param args
	 * @return
	 */
	public <E> E getForValue(String sql, Object... args) {

		return null;
	}

	/**
	 * 
	 * @param sql
	 * @param args
	 * @return
	 */
	public List<T> getForList(String sql, Object... args) {
		return null;

	}

	/**
	 * 
	 * @param sql
	 * @param args
	 * @return
	 */
	public T get(String sql, Object... args) {
		return null;
	}

	/**
	 * INSERT,UPDATE,DELETE
	 * 
	 * @param sql
	 * @param args
	 */
	public void update(String sql, Object... args) {

	}
}
