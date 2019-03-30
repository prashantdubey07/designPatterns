package com.prashant.structural.composite;

public class CompositeDemo {
public static void main(String[] args) {
	Menu mainMenu = new Menu("Main","/main");
	MenuItem safetyMenuItem = new MenuItem("safety","/safety");
	mainMenu.add(safetyMenuItem);
	Menu claimsSubMenu = new Menu("Claims","/claims");
	mainMenu.add(claimsSubMenu);
		MenuItem personalClaimsMenuItem = new MenuItem("Personal Claim","/personalClaims");
		claimsSubMenu.add(personalClaimsMenuItem);
		System.out.println(mainMenu.toString());
}
}
