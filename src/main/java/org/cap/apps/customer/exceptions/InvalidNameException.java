package org.cap.apps.customer.exceptions;

public class InvalidNameException extends RuntimeException{
	
	public InvalidNameException() {
		
	}
	
	public InvalidNameException(String msg) {
		super(msg);
	}

}
