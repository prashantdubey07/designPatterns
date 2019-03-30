package com.prashant.behavioral.interpreter;

public class OrExpression implements Expression {

	private Expression exptression1;
	private Expression exptression2;
	
	public OrExpression(Expression exptression1, Expression exptression2) {
		super();
		this.exptression1 = exptression1;
		this.exptression2 = exptression2;
	}

	@Override
	public boolean interpret(String context) {
		// TODO Auto-generated method stub
		return exptression1.interpret(context) || exptression2.interpret(context);
				
				
	}

}
