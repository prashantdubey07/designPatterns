/**
 * 
 */
package com.prashant.structural.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author happy
 *
 */
public class SortAdapter implements Sorter {
	public int[] sort(int [] list)
	{
		System.out.println("in adapter");
		List<Integer> numberList = new ArrayList<Integer>();
		ListSorter listSorter= new ListSorter();
		for(int i : list)
			numberList.add(i);
		listSorter.sort(numberList);
		for(int i=0;i< numberList.size();i++)
			list[i]= numberList.get(i);
		return list;
		
	}
	
}
