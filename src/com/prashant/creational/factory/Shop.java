package com.prashant.creational.factory;

public class Shop extends Website {

	@Override
	public void createWebsite() {
		listOfPage.add(new HomePage());
		listOfPage.add(new AboutPage());
		listOfPage.add(new CartPage());
		listOfPage.add(new ContactPage());
		listOfPage.add(new OrderPage());
	}

}
