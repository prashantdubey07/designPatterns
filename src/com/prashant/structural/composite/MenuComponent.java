package com.prashant.structural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {

	String name;
	String url;
	List<MenuComponent> menucomponents = new ArrayList<>();

	public String getName() {
		return name;
	}

	public String getUrl() {
		return url;
	}

	public List<MenuComponent> getMenucomponents() {
		return menucomponents;
	}

	public abstract String toString();

	public String print(MenuComponent menuComponent) {
		StringBuilder sb = new StringBuilder("");
		sb.append(name).append(":").append(url).append("\n");
		return sb.toString();
	}
}
