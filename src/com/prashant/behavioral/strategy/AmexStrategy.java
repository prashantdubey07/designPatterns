package com.prashant.behavioral.strategy;

public class AmexStrategy extends ValidateStrategy {

	@Override
	public boolean isValid(CreditCard crediCard) {
		boolean isValid  = true;
		isValid = crediCard.getNumber().startsWith("37")||crediCard.getNumber().startsWith("34");
		if(isValid)
		{
			isValid = crediCard.getNumber().length() == 15;
		}
		if(isValid)
		{
			isValid = luhnCheck(crediCard.getNumber());
		}
		return isValid;
	}

}
