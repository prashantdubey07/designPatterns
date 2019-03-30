package com.prashant.behavioral.observer;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class Subject {
	private List<Observer> observers = new CopyOnWriteArrayList<>();
	
	abstract void setState(String state);
	abstract String getState();
	
	public void attach(Observer observer) {
		observers.add(observer);
	}
	public void dettach(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyObservers() {
		for(Observer observer : observers) {
			observer.update();
		}
	}
}
