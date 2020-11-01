package org.cap.apps.customer.exceptions;

public class InvalidIdException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8943713223922191371L;

	public InvalidIdException() {

	}

	public InvalidIdException(String msg) {
		super(msg);
	}
}
