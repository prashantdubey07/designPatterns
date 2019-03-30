package com.prashant.creational.singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DbSingletonDemo {
	public static void main(String[] args) {
		DbSingleton dbSingleton = DbSingleton.getInstance();
		long first =0,second =0;
		first = System.nanoTime();
		Connection connection = dbSingleton.getConnection();
		second = System.nanoTime();
		System.out.println(second-first);
		Statement statement =null;
		try {
			statement = connection.createStatement();
			int count = statement.executeUpdate("CREATE TABLE UserTemp (id int, name varchar(20))");
			System.out.println("Table created");
		}catch(SQLException s) {
			s.printStackTrace();
		}
		first = System.nanoTime();
		 connection = dbSingleton.getConnection();
		second = System.nanoTime();
		System.out.println(second-first);
	}
}
