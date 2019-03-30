package com.prashant.behavioral.visitor;

public class VisitorDemo {
	public static void main(String[] args) {
			PartsOrder partsOrder = new PartsOrder();
			partsOrder.addPart(new Wheel());
			partsOrder.addPart(new Fender());
			partsOrder.addPart(new Oil());
			partsOrder.addPart(new Oil());
			partsOrder.accept(new AtvPartShippingVisitor());
	}
}
