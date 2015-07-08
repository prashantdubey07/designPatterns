/**
 * 
 */
package com.prashant.behavioral.chainOfResponsibility;

/**
 * @author happy
 *
 */
public class ChainOfResponsibilityExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Logger logger= new LoggerConsole();
		logger.log("from main only console");
		
		
		Logger logger1= new LoggerMail();
		logger.setNext(logger1);
		logger.log("from main only console and mail");
		
		
		Logger logger2= new LoggerPrinter();
		logger1.setNext(logger2);
		logger.log("from main only console, mail and printer");
	}

}
