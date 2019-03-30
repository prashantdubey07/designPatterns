package com.prashant.behavioral.template.second;

public class WebOrder extends OrderTemplate {

	@Override
	protected void doCheckOut() {
		System.out.println("get Items from cart");
		System.out.println("set Gift preferences");
		System.out.println("set delivery address");
		System.out.println("set billing address");
	}

	@Override
	protected void doPayment() {
		System.out.println("Process Payment without card present");
	}

	@Override
	protected void doReciept() {
		System.out.println("email reciept");
	}

	@Override
	protected void doDelivery() {
		System.out.println("ship the item to address");
	}

}
