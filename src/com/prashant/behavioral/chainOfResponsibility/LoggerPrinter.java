/**
 * 
 */
package com.prashant.behavioral.chainOfResponsibility;

/**
 * @author happy
 *
 */
public class LoggerPrinter extends Logger{

	@Override
	public void writeMessage(String msg) {
		System.out.println("i am Printer and message for me is : "+msg );
	}

}
