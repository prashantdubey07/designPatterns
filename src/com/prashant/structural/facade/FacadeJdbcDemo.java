package com.prashant.structural.facade;

public class FacadeJdbcDemo {

	public static void main(String[] args) {
		JDBCFacade jdbcFacade= new JDBCFacade();
		//jdbcFacade.createTable();
		jdbcFacade.insertInToTable();
		jdbcFacade.getAddress().stream().forEach(System.out::println);
	}

}
