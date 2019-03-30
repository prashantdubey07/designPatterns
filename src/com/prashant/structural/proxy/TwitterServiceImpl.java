package com.prashant.structural.proxy;

import java.util.List;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterServiceImpl implements TwitterService {

	private static final String TWITTER_CONSUMER_KEY = "TFEEvpU2Qszsv3095oBE8srDH";
	private static final String TWITTER_SECRET_KEY = "fdQspOHp843c72DAGDAKPPiBM6ckYoh5JI1XQx5l0K5HC12OTp";
	private static final String TWITTER_ACCESS_TOKEN = "428798331-mTRD79idHwzYLPqVL4wz24polsn7qtOzBzA8Hh2Q";
	private static final String TWITTER_ACCESS_TOKEN_SECRET = "7vHh5jVWUwwfjdq7WcZrr5dAQYAwFrOSzav1JsQ2YsXOL";

	@Override
	public String getTimeline(String screenName) {

		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true).setOAuthConsumerKey(TWITTER_CONSUMER_KEY).setOAuthConsumerSecret(TWITTER_SECRET_KEY)
				.setOAuthAccessToken(TWITTER_ACCESS_TOKEN).setOAuthAccessTokenSecret(TWITTER_ACCESS_TOKEN_SECRET);
		TwitterFactory tf = new TwitterFactory(cb.build());
		Twitter twitter = tf.getInstance();
		StringBuilder builder = new StringBuilder();
		try {
			Query query = new Query(screenName);
			QueryResult result;
			do {
				result = twitter.search(query);
				//twitter.getDirectMessages(arg0, arg1);
				List<Status> tweets = result.getTweets();
				for (Status tweet : tweets) {
					builder.append("@" + tweet.getUser().getScreenName() + " - " + tweet.getText());
					builder.append("\n");
				}
			} while ((query = result.nextQuery()) != null);

		} catch (TwitterException te) {
			te.printStackTrace();
			System.out.println("Failed to search tweets: " + te.getMessage());
		}
		return builder.toString();
	}
	
	public void getUsersTweet(String userName) {
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true).setOAuthConsumerKey(TWITTER_CONSUMER_KEY).setOAuthConsumerSecret(TWITTER_SECRET_KEY)
				.setOAuthAccessToken(TWITTER_ACCESS_TOKEN).setOAuthAccessTokenSecret(TWITTER_ACCESS_TOKEN_SECRET);
			TwitterFactory tf = new TwitterFactory(cb.build());
			Twitter twitter = tf.getInstance();
			StringBuilder builder = new StringBuilder();
	        try {
	            List<Status> statuses;
	            String user = userName;
	            if (userName != null) {
	                statuses = twitter.getUserTimeline(userName);
	            } else {
	                user = twitter.verifyCredentials().getScreenName();
	                statuses = twitter.getUserTimeline();
	            }
	            System.out.println("Showing @" + user + "'s user timeline.");
	            for (Status status : statuses) {
	                System.out.println("@" + status.getUser().getScreenName() + " - " + status.getText());
	            }
	        } catch (TwitterException te) {
	            te.printStackTrace();
	            System.out.println("Failed to get timeline: " + te.getMessage());
	            System.exit(-1);
	        }
	}

	@Override
	public void postToTimeline(String screenName, String message) {
		System.out.println(screenName + message);

	}
}