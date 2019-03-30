/**
 * 
 */
package com.prashant.structural.bridge.shape1;

/**
 * @author happy
 *
 */
public class Square extends Shape{

	public Square(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void applyColor() {
		color.applyColor();		
	}

}
