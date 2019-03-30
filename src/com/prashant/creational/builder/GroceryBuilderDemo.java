package com.prashant.creational.builder;

public class GroceryBuilderDemo {

	public static void main(String[] args) {
		Groccery.Builder builder = new Groccery.Builder();
		builder.milk("sanchi").snacks("haldiram").sweet("Anand").cookies("parleG").generalGroccery("household");
		Groccery groccery = builder.build();
		System.out.println(groccery.getMilk()+" "
				+groccery.getSweet()+" "
				+groccery.getSnacks()+" "
				+groccery.getGeneralGroccery()+" "
				+groccery.getCookies()
				);
	}

}
