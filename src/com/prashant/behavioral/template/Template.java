/**
 * 
 */
package com.prashant.behavioral.template;

/**
 * @author happy
 *
 */
public abstract class Template {
	public void template() {
		System.out.println("displaying");
		display();
		System.out.println("sorting");
		sort();
		System.out.println("displaying");
		display();
		System.out.println("adding");
		add();
	}
	public abstract void display();
	public abstract void sort();
	public abstract void add();
	
}
