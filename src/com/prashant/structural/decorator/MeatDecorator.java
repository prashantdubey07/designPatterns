package com.prashant.structural.decorator;

public class MeatDecorator extends SandwichDecorator {

	public MeatDecorator(Sandwich customSandwich) {
		super(customSandwich);
	}

	@Override
	public String make() {
		return customSandwich.make() + addMeat();
	}

	public String addMeat() {
		return " + chicken";
	}
}
