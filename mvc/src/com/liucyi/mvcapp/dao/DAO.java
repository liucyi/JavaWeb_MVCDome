package com.liucyi.mvcapp.dao;

import java.util.List;

/*
 * ��װ������CRUD�ķ���
 * ��ǰDAOֱ���ڷ����л�ȡ���ݿ�����
 * ����DAO��ȥDButils�������
 * 
 * */
public class DAO<T> {

	private Class<T> clazz;

	/**
	 * ����ĳһ��ֵ
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
