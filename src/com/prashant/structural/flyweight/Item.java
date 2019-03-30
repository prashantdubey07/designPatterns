package com.prashant.structural.flyweight;

//instance of item will be flyweights
public class Item {
	
	private final String name;

	public Item(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + "]";
	}
	
	

}
