package com.prashant.behavioral.interator;

import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		BikeRepository bikeRepo = new BikeRepository();
		bikeRepo.addBike("hayabusa");
		bikeRepo.addBike("R1");
		bikeRepo.addBike("beneli");
		bikeRepo.addBike("z900");
		bikeRepo.addBike("RS");
		Iterator<String> iterator = bikeRepo.iterator();
		for(String str : bikeRepo) {
			System.out.println(str);	
		}
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
