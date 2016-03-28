package com.liucyi.mvcapp.db;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * JDBC�����Ĺ�����
 * 
 * @author Administrator
 *
 */
public class JdbcUtils {

	/**
	 * �ͷ�connection����
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
	 * ���ص�����Դ��һ��Connection����
	 * 
	 * @return
	 */
	public static Connection getConnection() throws SQLException {

		return dataSource.getConnection();
	}
}
