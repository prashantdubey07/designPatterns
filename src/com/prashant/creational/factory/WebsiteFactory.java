package com.prashant.creational.factory;

import java.util.Calendar;

public class WebsiteFactory {
	
	public static Website getWebsite(String str)
	{
		switch (str) {
		case "Blog":
			return new Blog();

		case "Shop":
			return new Shop();
			
		default :
			return null;
		}
	}
	
	public static Website getWebsite(WebsiteType type)
	{
		switch (type) {
		case BLOG:
			return new Blog();

		case SHOP:
			return new Shop();
			
		default :
			return null;
		}
	}

}
