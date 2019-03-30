package com.prashant.creational.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {
	List<Page> listOfPage = new ArrayList<>();

	public List<Page> getListOfPage() {
		return listOfPage;
	}

	public Website() {
		createWebsite();
	}

	public abstract void createWebsite();

}
