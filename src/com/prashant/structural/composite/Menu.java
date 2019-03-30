package com.prashant.structural.composite;

import java.util.Iterator;

public class Menu extends MenuComponent {

	public Menu() {
	}

	public Menu(String name, String url) {
		this.name = name;
		this.url = url;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("");
		sb.append(print(this));
		Iterator<MenuComponent> itr = menucomponents.iterator();
		while (itr.hasNext()) {
			MenuComponent menuComponent = itr.next();
			sb.append(menuComponent.toString());
		}
		return sb.toString();
	}

	public MenuComponent add(MenuComponent menuComponent) {
		menucomponents.add(menuComponent);
		return menuComponent;
	}

	public MenuComponent remove(MenuComponent menuComponent) {
		menucomponents.remove(menuComponent);
		return menuComponent;

	}

}
