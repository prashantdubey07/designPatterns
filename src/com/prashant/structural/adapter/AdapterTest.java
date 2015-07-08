/**
 * 
 */
package com.prashant.structural.adapter;

import java.util.Arrays;

/**
 * @author happy
 *
 */
public class AdapterTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Sorter sort= new SortAdapter();
		int []arr= {2,9,12,4,35,11,6,18};
		System.out.println("before Sorting");
		System.out.println(Arrays.toString(arr));
		sort.sort(arr);
		System.out.println("after Sorting");
		System.out.println(Arrays.toString(arr));

	}

}
