/**
 * 
 */
package com.prashant.creational.builder;

/**
 * @author happy
 *
 */

public class Groccery {
	public String milk;
	public String sweet;
	public String snacks;
	public String getMilk() {
		return milk;
	}


	public String getSweet() {
		return sweet;
	}


	public String getSnacks() {
		return snacks;
	}


	public String getGeneralGroccery() {
		return generalGroccery;
	}


	public String getCookies() {
		return cookies;
	}


	public String generalGroccery;
	public String cookies;
	public Groccery(Builder builder) {
		this.milk = builder.milk;
		this.sweet = builder.sweet;
		this.snacks = builder.snacks;
		this.generalGroccery = builder.generalGroccery;
		this.cookies = builder.cookies;
	}
	
	
	public static class Builder {
		public String milk;
		public String sweet;
		public String snacks;
		public String generalGroccery;
		public String cookies;
		
		public Builder() {}
		
		public Groccery build() {
			return new Groccery(this);
		}
		
		public Builder milk(String milk) {
			this.milk = milk;
			return this;
		}
		public Builder sweet(String sweet) {
			this.sweet = sweet;
			return this;
		}
		public Builder snacks(String snacks) {
			this.snacks = snacks;
			return this;
		}
		public Builder generalGroccery(String generalGroccery) {
			this.generalGroccery = generalGroccery;
			return this;
		}
		public Builder cookies(String cookies) {
			this.cookies = cookies;
			return this;
		}
	}
	
}
