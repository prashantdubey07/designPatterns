package com.prashant.behavioral.interpreter;

public class InterpreterDemo {

	static Expression buildInterpreterTree() {
		Expression terminal1 = new TerminalExpression("Lions");
		Expression terminal2 = new TerminalExpression("Tigers");
		Expression terminal3 = new TerminalExpression("Bears");
		Expression alt1 = new AndExpression(terminal2, terminal3);
		Expression alt2 = new OrExpression(alt1, terminal1);
		return new AndExpression(terminal3, alt2);
	}
	public static void main(String[] args) {
		//String context = "Lions";
		//String context = "Tigers";
		//String context = "Bears";
		String context = "Tigers Bears";
		Expression expression = buildInterpreterTree();
		System.out.println(context +" is  "+ expression.interpret(context));
			
	}

}
