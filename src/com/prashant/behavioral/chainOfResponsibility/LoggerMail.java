/**
 * 
 */
package com.prashant.behavioral.chainOfResponsibility;

/**
 * @author happy
 *
 */
public class LoggerMail extends Logger{

	@Override
	public void writeMessage(String msg) {
		System.out.println("i am Mail and message for me is : "+msg );
	}

}
