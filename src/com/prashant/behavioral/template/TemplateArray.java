/**
 * 
 */
package com.prashant.behavioral.template;

import java.util.Arrays;

/**
 * @author happy
 *
 */
public class TemplateArray extends Template{

	int [] list  = {1,4,18,7,13,43, 3};
	
	@Override
	public void display() {
		System.out.println("array is :");
		System.out.println(Arrays.toString(list));
	}

	@Override
	public void sort() {
		System.out.println("array is after sort:");
		Arrays.sort(list);
		System.out.println(Arrays.toString(list));
		}

	@Override
	public void add() {
		System.out.println("total is of array:");
		int sum =0;
		for(int i : list)
			sum +=i;
		System.out.println(sum);
		
	}

}
