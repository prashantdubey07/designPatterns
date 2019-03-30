package com.prashant.behavioral.strategy;

public class StrategyDemo {

	public static void main(String[] args) {

		CreditCard amexCard = new CreditCard(new AmexStrategy());
		amexCard.setNumber("379185883464283");
		amexCard.setExpriryDate("04/2020");
		amexCard.setCvv("123");
		
		System.out.println("is amex card is valid : "+ 	amexCard.isValid());
		
		CreditCard visaCard = new CreditCard(new VisaStrategy());
		visaCard.setNumber("4539589763663402");
		visaCard.setExpriryDate("05/2018");
		visaCard.setCvv("324");
		
		System.out.println("is visa card is valid : "+ 	visaCard.isValid());
	}

}
