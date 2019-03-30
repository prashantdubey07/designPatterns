package com.prashant.structural.decorator;

public abstract class SandwichDecorator implements Sandwich {

	protected Sandwich customSandwich;
	
	public SandwichDecorator(Sandwich customSandwich) {
		super();
		this.customSandwich = customSandwich;
	}

	@Override
	public String make() {
		return customSandwich.make();
	}

}
