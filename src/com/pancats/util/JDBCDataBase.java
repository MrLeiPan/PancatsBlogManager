package com.pancats.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 数据库连接
 * 
 * @author 小疯子
 *
 */
public class JDBCDataBase {
	private String driverUrl = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/PancatsBlogManager?serverTimezone=UTC&useSSL=false";
	private String user = "root";
	private String password = "123456";
	private Connection conn = null;

	public JDBCDataBase() {
		try {
			Class.forName(driverUrl);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Connection getConn() {
		return conn;
	}
	
	public void close() throws SQLException{
		conn.close();
	}

}
