/**
 * 
 */
package com.prashant.behavioral.chainOfResponsibility;

/**
 * @author happy
 *
 */
public abstract class Logger {
	private Logger next;

	public void setNext(Logger next)
	{
		this.next= next;
	}
	public void log(String msg)
	{
			if(msg == null)
			writeMessage("message from Logger");
			else
				writeMessage(msg);
			if(next != null)
				next.log(msg);
	}
	public abstract void writeMessage(String msg);

}
