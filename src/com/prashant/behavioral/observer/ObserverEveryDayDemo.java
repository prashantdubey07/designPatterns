package com.prashant.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverEveryDayDemo {

	public static void main(String[] args) {
		TwitterStream twitterStream = new TwitterStream();
		ClientTemp client1 = new ClientTemp("prashant");
		ClientTemp client2 = new ClientTemp("abhishek");
		
		twitterStream.addObserver(client1);
		twitterStream.addObserver(client2);
		
		twitterStream.someoneTweeted();
		
	}

}

class TwitterStream extends Observable{
	public void someoneTweeted() {
		setChanged();
		//System.out.println("Notifying");
		notifyObservers();
	}
}

class ClientTemp implements Observer{
	private String name;
	
	public ClientTemp(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("update "+name+"'s tweeted something");
	}
	
}
