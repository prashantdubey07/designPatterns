/**
 * 
 */
package com.prashant.structural.adapter;

import java.util.Collections;
import java.util.List;

/**
 * @author happy
 *
 */
public class ListSorter {
	
	public List<Integer> sort(List<Integer> list)
	{
		System.out.println("in adaptee");
		Collections.sort(list);
		return list;
		
	}

}
