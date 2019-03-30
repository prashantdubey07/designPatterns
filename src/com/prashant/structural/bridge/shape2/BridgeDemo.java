package com.prashant.structural.bridge.shape2;

public class BridgeDemo {
	public static void main(String[] args) {
		Movie movie = new Movie();
		movie.setClassification("action");
		movie.setTitle("Avengers");
		movie.setRuntime("2:15 hours");
		movie.setYear("2012");
		
		Formatter printFormatter = new PrintFormatter();
		Printer moviePrinter = new MoviePrinter(movie);
		String str =moviePrinter.print(printFormatter);
		System.out.println(str);
		
		Formatter htmlFormatter = new HTMLFormatter();
		String strHTML = moviePrinter.print(htmlFormatter);
		System.out.println(strHTML);
	}
}
