package com.prashant.behavioral.template.second;

public abstract class OrderTemplate {

	public boolean isGift;

	public void processOrder() {
		doCheckOut();
		doPayment();
		if (isGift)
			wrapGift();
		else
			doReciept();
		doDelivery();
	}

	protected abstract void doCheckOut();

	protected abstract void doPayment();

	protected abstract void doReciept();
	
	protected abstract void doDelivery();

	public final void wrapGift() {
		System.out.println("gift is wrapped");
	}

}
