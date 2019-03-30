package com.prashant.structural.flyweight;

public class InventoryManagementSystem {

	public static void main(String[] args) {
		InventorySystem inventorySystem = new InventorySystem();
		inventorySystem.takeOrder("Bose Headphones", 111);
		inventorySystem.takeOrder("Sony Headphones", 112);
		inventorySystem.takeOrder("Sony TV", 113);
		inventorySystem.takeOrder("LG TV", 114);
		inventorySystem.takeOrder("Samsung TV", 115);
		inventorySystem.takeOrder("Sony TV", 116);
		inventorySystem.takeOrder("Bose Headphones", 117);
		inventorySystem.takeOrder("Bose Headphones", 118);
		
		inventorySystem.process();
		
		System.out.println(inventorySystem.report());
	}

}
