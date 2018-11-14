package com.speetail.exception;

public class AutomationException extends RuntimeException{
	
	
	private static final long serialVersionUID = 1L;
	
	public AutomationException(final String message) {
		super(message);
	}
	
	public AutomationException(final String message, final Exception e) {
		super(message,e);
	}

}
