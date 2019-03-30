package com.prashant.behavioral.memento.everydaydemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MementoEveryDayDemo {

	public static void serialize(Employee emp) {
		try {
			FileOutputStream fIO = new FileOutputStream(new File("C:\\\\Users\\\\happy\\\\workspace\\\\designPattern\\\\src\\\\com\\\\prashant\\\\behavioral\\\\memento\\\\employee.ser"));
			ObjectOutputStream objOut = new ObjectOutputStream(fIO);
			objOut.writeObject(emp);
			objOut.close();
			fIO.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Employee deSerialize() {
		Employee employee = null;
		try {
			FileInputStream fileInput = new FileInputStream(new File("C:\\Users\\happy\\workspace\\designPattern\\src\\com\\prashant\\behavioral\\memento\\employee.ser"));
			ObjectInputStream objInput = new ObjectInputStream(fileInput);
			employee = (Employee) objInput.readObject();
			objInput.close();
			fileInput.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return employee;
	}
	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.setName("prashant");
		emp.setAddress("BTM Bangalore");
		emp.setPhoneNumber("7411856093");
		serialize(emp);
		Employee emp2 = deSerialize();
		System.out.println(emp);
		System.out.println(emp2);
	}

}
