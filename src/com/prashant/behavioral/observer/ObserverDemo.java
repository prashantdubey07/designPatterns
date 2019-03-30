package com.prashant.behavioral.observer;

public class ObserverDemo {

	public static void main(String[] args) {
		Subject subject = new MessageStream();
		PhoneClient phoneClient = new PhoneClient(subject);
		TabletClient tabletClient = new TabletClient(subject);
		phoneClient.addMessage("here a new message");
		tabletClient.addMessage("another message");
	}

}
