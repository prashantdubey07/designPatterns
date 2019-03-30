package com.prashant.creational.factory;

public class FactoryDemo {

	public static void main(String[] args) {
			 Website web = WebsiteFactory.getWebsite("Blog");
			 web.getListOfPage().forEach(System.out::println);
			  web = WebsiteFactory.getWebsite("Shop");
			 web.getListOfPage().forEach(System.out::println);
			 
			 
			 
			 web = WebsiteFactory.getWebsite(WebsiteType.BLOG);
			 web.getListOfPage().forEach(System.out::println);
			  web = WebsiteFactory.getWebsite(WebsiteType.SHOP);
			 web.getListOfPage().forEach(System.out::println);
	}

}
