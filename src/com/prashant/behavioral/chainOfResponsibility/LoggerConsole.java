/**
 * 
 */
package com.prashant.behavioral.chainOfResponsibility;

/**
 * @author happy
 *
 */
public class LoggerConsole extends Logger {

	@Override
	public void writeMessage(String msg) {
		System.out.println("i am Console and message for me is : "+msg );
	}

}
