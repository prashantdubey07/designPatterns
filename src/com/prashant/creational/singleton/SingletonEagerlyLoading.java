package com.prashant.creational.singleton;

public class SingletonEagerlyLoading {
	private static SingletonEagerlyLoading singletonEagerlyLoading = new SingletonEagerlyLoading();

	private SingletonEagerlyLoading() {
	}

	public SingletonEagerlyLoading getInstance() {
		return singletonEagerlyLoading;
	}
}
