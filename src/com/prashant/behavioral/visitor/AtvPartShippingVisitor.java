package com.prashant.behavioral.visitor;

import java.util.List;

public class AtvPartShippingVisitor implements AtvPartVisitor {
	double shippingAmount = 0;

	@Override
	public void visit(PartsOrder partsOrder) {
		System.out.println("if more than three thing will give discount ");
		List<AtvPart> orders = partsOrder.getParts();
		if (orders.size() > 3) {
			System.out.println("before discount:" + shippingAmount);
			shippingAmount -= 5;
		}
		System.out.println("shipping amount is :" + shippingAmount);
	}

	@Override
	public void visit(Wheel wheel) {
		shippingAmount += 15;
		System.out.println("Wheels ");
	}

	@Override
	public void visit(Oil oil) {
		shippingAmount += 9;
		System.out.println("Oil ");

	}

	@Override
	public void visit(Fender fender) {
		shippingAmount += 3;
		System.out.println("Fender ");
	}

}
