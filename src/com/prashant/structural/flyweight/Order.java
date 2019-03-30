package com.prashant.structural.flyweight;

public class Order {
private final int orderNumber;
private final Item item;
public Order(int orderNumber, Item item) {
	super();
	this.orderNumber = orderNumber;
	this.item = item;
}
@Override
public String toString() {
	return "Order [orderNumber=" + orderNumber + ", item=" + item + "]";
}

void processOrder() {
	System.out.println("Ordering "+item+ " for Order number"+ orderNumber);
}
}
