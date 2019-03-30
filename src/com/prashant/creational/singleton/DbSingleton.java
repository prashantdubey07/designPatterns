package com.prashant.creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingleton {
	private static volatile DbSingleton dbSingleton;
	private static volatile Connection connection;

	private DbSingleton() {
		try {
			DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
		} catch (SQLException e) {
			e.printStackTrace();
 		}
		if(dbSingleton != null) {
			throw new RuntimeException("Use get instance method "); 
		}
		if(connection != null)
		{
			throw new RuntimeException("Use get connection method "); 
		}
	}

	public static DbSingleton getInstance() {
		if(dbSingleton == null)
			synchronized (DbSingleton.class) {
				if(dbSingleton == null)
				{
					dbSingleton = new DbSingleton();
				}
			}
		return dbSingleton;
	}
	public Connection getConnection() {
		if(connection == null)
			synchronized (this.getClass()) {
				if(connection == null)
				{
					String dbUrl = "jdbc:derby:codejava/webdb;create=true";
					try {
						connection = DriverManager.getConnection(dbUrl);
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		return connection;
	}

}
