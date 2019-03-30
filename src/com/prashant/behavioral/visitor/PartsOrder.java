package com.prashant.behavioral.visitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PartsOrder implements AtvPart {
 private List<AtvPart> list = new ArrayList<>();
 public PartsOrder() {
	 
 }
 
 public void addPart(AtvPart atvPart) {
	 list.add(atvPart);
 }
 

 public List<AtvPart> getParts() {
	 return Collections.unmodifiableList(list);
 }

@Override
public void accept(AtvPartVisitor visitor) {
		for(AtvPart atvPart : list) {
			atvPart.accept(visitor);
		}
		visitor.visit(this);
}

 
 
}
