/**
 * 
 */
package com.prashant.creational.prototype;

/**
 * @author happy
 *
 */
public class PrototypeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Registry registry = new Registry();
		Movie movie = (Movie) registry.createItem("movie");
		movie.setTitle("padmavat");
		System.out.println(movie.getPrice());
		System.out.println(movie.getTitle());
		System.out.println(movie.getRuntime());
		System.out.println(movie);
		
		Book book = (Book) registry.createItem("book");
		book.setTitle("Little India");
		System.out.println(book.getPrice());
		System.out.println(book.getTitle());
		System.out.println(book.getNumberOfPages());
		System.out.println(book);
	}

}
