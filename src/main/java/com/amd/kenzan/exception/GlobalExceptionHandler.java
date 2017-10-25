package com.amd.kenzan.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class.getName());
	private ErrorResponse errorResponse;

	@ExceptionHandler(NumberFormatException.class)
	public ErrorResponse handleIllegalArgumentException(NumberFormatException ex) {
		LOGGER.info("Invoking GlobalExceptionHandler.handleIllegalArgumentException: " + ex.getMessage() + " "
				+ org.apache.commons.lang.exception.ExceptionUtils.getStackTrace(ex));
		errorResponse = setErrorMsg(ex, HttpStatus.BAD_REQUEST.value());
		return errorResponse;
	}

	@ExceptionHandler(value = { FizzBuzzValidationException.class })
	public ErrorResponse fizzBuzzValidationException(FizzBuzzValidationException ex) {
		LOGGER.info("Invoking GlobalExceptionHandler.fizzBuzzValidationException: " + ex.getMessage() + " "
				+ org.apache.commons.lang.exception.ExceptionUtils.getStackTrace(ex));
		errorResponse = setErrorMsg(ex, HttpStatus.NOT_ACCEPTABLE.value());
		return errorResponse;
	}

	public ErrorResponse setErrorMsg(Exception ex, Integer errorCode) {
		ErrorResponse errorResponseMsg = new ErrorResponse();
		errorResponseMsg.setErrorCode(errorCode);
		errorResponseMsg.setReason(ex.getMessage());
		return errorResponseMsg;
	}
}