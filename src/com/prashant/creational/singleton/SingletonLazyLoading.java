package com.prashant.creational.singleton;

public class SingletonLazyLoading {

	private static volatile SingletonLazyLoading singletonLazyLoading;

	private SingletonLazyLoading() {
		if(singletonLazyLoading != null) {
			throw new RuntimeException("Use get instance method "); 
		}
	}

	public SingletonLazyLoading getInstance() {
		if(singletonLazyLoading == null)
			synchronized (this.getClass()) {
				if(singletonLazyLoading == null)
				{
					singletonLazyLoading = new SingletonLazyLoading();
				}
			}
		return singletonLazyLoading;
	}

}
