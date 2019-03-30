package com.prashant.behavioral.memento;



public class MementoDemo {

	
	public static void main(String[] args) {

		CareTaker careTaker = new CareTaker();
		Employee employee = new Employee();
		employee.setName("prashant");
		employee.setAddress("BTM Bangalore");
		employee.setPhoneNumber("7411856093");
		System.out.println("employee before save "+employee);
		careTaker.save(employee);
		employee.setPhoneNumber("9424439265");
		careTaker.save(employee);
		System.out.println("employee after save "+employee);
		employee.setPhoneNumber("9620566377");
		System.out.println("employee after changing phone number "+employee);
		careTaker.revert(employee);
		System.out.println("employee after revert to last save point "+employee);
		
		careTaker.revert(employee);
		System.out.println("employee after revert to original "+employee);
	}

}
