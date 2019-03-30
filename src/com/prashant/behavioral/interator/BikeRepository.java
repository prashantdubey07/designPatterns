package com.prashant.behavioral.interator;

import java.util.Iterator;

public class BikeRepository implements Iterable<String>{
	private String[] bikes;
	private int index;

	public BikeRepository() {
		super();
		bikes = new String[10];
		index = 0;
	}

	public void addBike(String bikeName) {
		if (index == bikes.length) {
			String largerBikes[] = new String[index + 5];
			System.arraycopy(bikes, 0, largerBikes, 0, index);
			bikes = largerBikes;
			largerBikes = null;
		}
		bikes[index++] = bikeName;
	}

	@Override
	public Iterator<String> iterator() {

		Iterator<String> iter = new Iterator<String>() {
			private int currentIndex =0;
			@Override
			public boolean hasNext() {
				if(currentIndex < bikes.length && bikes[currentIndex] != null)
					return true;
				else
					return false;
			}

			@Override
			public String next() {
				return bikes[currentIndex++];
			}
		};
		return iter;
	}

}
