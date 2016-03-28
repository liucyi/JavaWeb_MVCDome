package com.liucyi.mvcapp.db;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * JDBC操作的工具类
 * 
 * @author Administrator
 *
 */
public class JdbcUtils {

	/**
	 * 释放connection连接
	 * 
	 * @param connection
	 */
	public static void releaseConnection(Connection connection) {
		  try {
			if (connection!=null) {
				connection.close();
			}
		} catch (Exception e) {
			 e.printStackTrace();
		}

	}

	private static DataSource dataSource = null;
	static {

		dataSource = new ComboPooledDataSource("mvcapp");
	}

	/**
	 * 返回的数据源的一个Connection对象
	 * 
	 * @return
	 */
	public static Connection getConnection() throws SQLException {

		return dataSource.getConnection();
	}
}
