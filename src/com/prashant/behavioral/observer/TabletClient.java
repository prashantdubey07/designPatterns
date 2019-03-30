package com.prashant.behavioral.observer;

public class TabletClient extends Observer{

	public  TabletClient(Subject subject) {
		this.subject = subject;
		subject.attach(this);
	}
	
	public void addMessage(String message) {
		subject.setState(message +" - sent from Tablet");
	}
	@Override
	public void update() {
		System.out.println("Tablet stream : "+ subject.getState());
	}

}
