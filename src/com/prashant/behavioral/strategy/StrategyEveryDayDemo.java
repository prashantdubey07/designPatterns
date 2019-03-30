package com.prashant.behavioral.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StrategyEveryDayDemo {

	public static void main(String[] args) {

		Person prashant = new Person(29, "prashant", "7411856093");
		Person abhishek = new Person(31, "abhishek", "9424439265");
		Person kirti = new Person(29, "kirti", "9620566377");
		Person Krishna = new Person(30, "krishna", "9897979797");

		List<Person> persons = new ArrayList<>();
		persons.add(abhishek);
		persons.add(prashant);
		persons.add(kirti);
		persons.add(Krishna);

		System.out.println("before sorting");
		persons.stream().forEach(System.out::println);

		Collections.sort(persons, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getAge() > o2.getAge() ? 1 : o1.getAge() == o2.getAge() ? 0 : -1;
			}
		});
		System.out.println("after sorted by age");
		persons.stream().forEach(System.out::println);
		
		System.out.println("after sorted by name");
		persons.stream().sorted((p1, p2)->p1.getName().compareTo(p2.getName())).forEach(System.out::println);
		
		
	}

}
