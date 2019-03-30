package com.prashant.behavioral.visitor;

public interface AtvPartVisitor {

	void visit(PartsOrder partsOrder);

	void visit(Wheel wheel);

	void visit(Oil oil);

	void visit(Fender fender);

}
