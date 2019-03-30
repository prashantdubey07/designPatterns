package com.prashant.structural.proxy;

public class TwitterServiceStub implements TwitterService {

	@Override
	public String getTimeline(String screenName) {
		return "my first post";
	}

	@Override
	public void postToTimeline(String screenName, String message) {

	}
	
	public void getUsersTweet(String userName) {
		
	}

}
