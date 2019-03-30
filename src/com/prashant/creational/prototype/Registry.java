/**
 * 
 */
package com.prashant.creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @author happy
 *
 */
public class Registry {
	
	private Map<String,Item> items = new HashMap<>();
	
	public Registry() {
		loadItems();
	}
	
	public Item createItem(String type) {
		Item item = null;
		try {
			item = (Item)(items.get(type)).clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return item;
	}
	
	public void loadItems() {
		Movie movie = new Movie();
		movie.setTitle("Titanic");
		movie.setPrice(200	);
		movie.setRuntime("2 hours");
		
		items.put("movie", movie);
		
		Book book = new Book();
		book.setTitle("Titanic");
		book.setPrice(20);
		book.setNumberOfPages(300);
		
		items.put("book", book);
	}

}
