package com.prashant.structural.bridge.shape1;

public class Shape1Demo {

	public static void main(String[] args) {
		Color red = new Red() ;
		Shape square = new Square(red);
		
		Color blue = new Blue() ;
		Shape circle = new Circle(blue);
		circle.applyColor();
		square.applyColor();
	}

}
 