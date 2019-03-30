package com.prashant.structural.proxy;

public class TwitterDemo {

	public static void main(String[] args) {
		//TwitterService twitterService = (TwitterService) SecurityProxy.newInstance(new TwitterServiceStub());
		
		TwitterService twitterService = (TwitterService) SecurityProxy.newInstance(new TwitterServiceImpl());
		//System.out.println(twitterService.getTimeline("prashantdubey07"));
		//twitterService.getUsersTweet("abhishek99mile1");
		twitterService.getUsersTweet("prashantdubey07");
		
	//	twitterService.postToTimeline("prashantdubey07", "Welcome to Twitter ");
	}
}
