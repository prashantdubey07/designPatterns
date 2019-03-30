package com.prashant.structural.proxy;

public interface TwitterService {
	
	public String getTimeline(String screenName);
	public void  postToTimeline(String screenName, String message);
	
	public void getUsersTweet(String userName);

}
