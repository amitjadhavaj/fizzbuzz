package com.amd.kenzan.exception;

public class FizzBuzzValidationException extends Exception {

	private static final long serialVersionUID = 1L;

	public FizzBuzzValidationException() {
		super();
	}

	public FizzBuzzValidationException(String message) {
		super(message);
	}
}
