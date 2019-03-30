package com.prashant.behavioral.template.second;

public class StoreOrder extends OrderTemplate {


	@Override
	protected void doCheckOut() {
		System.out.println("ring up Items from cart");
	}

	@Override
	protected void doPayment() {
		System.out.println("Process Payment with card");
	}

	@Override
	protected void doReciept() {
		System.out.println("print reciept");
	}

	@Override
	protected void doDelivery() {
		System.out.println("bag items at the counter");
	}

}
