package com.liucyi.mvcapp.dao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.Connection;
import java.util.List;

import javax.enterprise.inject.New;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.runners.Parameterized.Parameter;

import com.liucyi.mvcapp.db.JdbcUtils;

/*
 * 封装基本的CRUD的方法
 * 当前DAO直接在方法中获取数据库连接
 * 整个DAO才去DButils解决方法
 * 
 * */
public class DAO<T> {
	private QueryRunner queryRunner = new QueryRunner();
	private Class<T> clazz;

	public DAO() {

		Type superClass = getClass().getGenericSuperclass();
		if (superClass instanceof ParameterizedType) {
			ParameterizedType parameterizedType = (ParameterizedType) superClass;
			Type[] typeArges = parameterizedType.getActualTypeArguments();
			if (typeArges != null && typeArges.length > 0) {
				if (typeArges[0] instanceof Class) {
					clazz = (Class<T>) typeArges[0];
				}
			}
		}
	}

	/**
	 * 返回某一个值
	 * 
	 * @param sql
	 * @param args
	 * @return
	 */
	public <E> E getForValue(String sql, Object... args) {
		 Connection connection =null;
		  try {
			connection=JdbcUtils.getConnection();
			return (E) queryRunner.query(connection, sql, new ScalarHandler(), args);
		} catch (Exception e) {
			// TODO: handle exception
		}
		  finally{
			   JdbcUtils.releaseConnection(connection);;
		  }
			return null;
	}

	/**
	 * 
	 * @param sql
	 * @param args
	 * @return
	 */
	public List<T> getForList(String sql, Object... args) {
		 Connection connection =null;
		  try {
			connection=JdbcUtils.getConnection();
			return queryRunner.query(connection, sql, new BeanListHandler<T>(clazz), args);
		} catch (Exception e) {
			// TODO: handle exception
		}
		  finally{
			   JdbcUtils.releaseConnection(connection);;
		  }
			return null;

	}

	/**
	 * 
	 * @param sql
	 * @param args
	 * @return
	 */
	public T get(String sql, Object... args) {
	 Connection connection =null;
	  try {
		connection=JdbcUtils.getConnection();
		return queryRunner.query(connection, sql, new BeanHandler<T>(clazz), args);
	} catch (Exception e) {
		// TODO: handle exception
	}
	  finally{
		   JdbcUtils.releaseConnection(connection);;
	  }
		return null;
	}

	/**
	 * INSERT,UPDATE,DELETE
	 * 
	 * @param sql
	 * @param args
	 */
	public void update(String sql, Object... args) {
 Connection connection =null;
  try {
	connection =JdbcUtils.getConnection();
	queryRunner.update(connection, sql, args);
} catch (Exception e) {
	  e.printStackTrace();
}finally	{
	JdbcUtils.releaseConnection(connection);
}
	}
}
