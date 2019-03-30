package com.prashant.behavioral.strategy;

public class VisaStrategy extends ValidateStrategy {

	@Override
	public boolean isValid(CreditCard crediCard) {
		boolean isValid  = true;
		isValid = crediCard.getNumber().startsWith("4");
		if(isValid)
		{
			isValid = crediCard.getNumber().length() == 16;
		}
		if(isValid)
		{
			isValid = luhnCheck(crediCard.getNumber());
		}
		return isValid;
	}

}
