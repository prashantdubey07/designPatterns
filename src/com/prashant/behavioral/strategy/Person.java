package com.prashant.behavioral.strategy;

public class Person {

	
	private int age;
	private String name;
	private String phoneNumber;
	public Person() {
		
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public Person(int age, String name, String phoneNumber) {
		super();
		this.age = age;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}
	
}
