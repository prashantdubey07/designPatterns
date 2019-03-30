package com.prashant.behavioral.strategy;

public class CreditCard {
	private String number;
	private String expriryDate;
	private String cvv;

	private ValidateStrategy strategy;
	
	public CreditCard() {

	}

	public CreditCard(ValidateStrategy strategy) {
		super();
		this.strategy =  strategy;
	}

	
	public boolean isValid() {
		return strategy.isValid(this);
	}
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getExpriryDate() {
		return expriryDate;
	}

	public void setExpriryDate(String expriryDate) {
		this.expriryDate = expriryDate;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	
}
