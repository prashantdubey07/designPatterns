package com.prashant.structural.facade;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import com.prashant.creational.singleton.DbSingleton;

public class JDBCFacade {
	DbSingleton dbSingleton = null;

	public JDBCFacade() {
		dbSingleton = DbSingleton.getInstance();
	}

	public int createTable() {
		int count = 0;
		try {
			Connection con = dbSingleton.getConnection();
			Statement st = con.createStatement();
			count = st.executeUpdate("CREATE TABLE Address (ID integer, StreetName varchar(64), City varchar(64) )");
			st.close();
			//con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}

	public int insertInToTable() {
		int count = 0;
		try {
			Connection con = dbSingleton.getConnection();
			Statement st = con.createStatement();
			count = st.executeUpdate(
					"insert into Address (ID, StreetName, City) values(1,'7th Main','Bangalore'),(2,'8th Main','Bangalore')");
			st.close();
			//con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}

	public List<Address> getAddress() {
		List<Address> addresses = new CopyOnWriteArrayList<>();
		try {
			Connection con = dbSingleton.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(
					"select * from Address");
			while(rs.next()) {
				System.out.println("Address ID is "+rs.getInt(1)+" for Street "+rs.getString(2)+" for City "+rs.getString(3));
				Address address = new Address();
				address.setId(rs.getInt(1));
				address.setStreetName(rs.getString(2));
				address.setCity(rs.getString(3));
				addresses.add(address);
			}
			st.close();
			//con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return addresses;
	}
}

class Address {
	private int id;
	private String streetName;
	private String city;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", streetName=" + streetName + ", city=" + city + "]";
	}

}
