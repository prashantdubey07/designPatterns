package com.prashant.behavioral.memento;

public class EmployeeMemento {
	private String name;
	private String phoneNumber;

	public EmployeeMemento(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	@Override
	public String toString() {
		return "EmployeeMemento [name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}

}
