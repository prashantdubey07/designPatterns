/**
 * 
 */
package com.prashant.structural.decorator;

/**
 * @author happy
 *
 */
public class DecoratorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Sandwich sandwich = new DressingDecorator(new MeatDecorator( new SimpleSandwich()));
		System.out.println(sandwich.make());
		
		sandwich = new MeatDecorator( new SimpleSandwich());
		System.out.println(sandwich.make());
	}

}
