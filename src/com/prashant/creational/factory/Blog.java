package com.prashant.creational.factory;

public class Blog extends Website {

	@Override
	public void createWebsite() {
		listOfPage.add(new HomePage());
		listOfPage.add(new AboutPage());
		listOfPage.add(new CommentPage());
		listOfPage.add(new ContactPage());
		listOfPage.add(new PostPage());
	}

}
