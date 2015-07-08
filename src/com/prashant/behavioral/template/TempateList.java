/**
 * 
 */
package com.prashant.behavioral.template;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author happy
 *
 */
public class TempateList extends Template {

	List<Integer> list  = Arrays.asList(1,4,18,7,13,43, 3);
	
	@Override
	public void display() {
		System.out.println("list is :");
		System.out.println(list.toString());
	}

	@Override
	public void sort() {
		System.out.println("list is after sort:");
		Collections.sort(list);
		System.out.println(list.toString());
	}

	@Override
	public void add() {
		System.out.println("total is of list:");
		int sum =0;
		for(int i : list)
			sum +=i;
		System.out.println(sum);
		
	}

}
