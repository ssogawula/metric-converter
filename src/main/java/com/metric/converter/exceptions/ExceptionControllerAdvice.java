package com.metric.converter.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionControllerAdvice {

	@ExceptionHandler(IllegalArgumentException.class)
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	public ErrorResponse handleIlligalArgumentsExceptions(IllegalArgumentException exception, HttpServletRequest request) {

		return new ErrorResponse(exception.getMessage(), request.getMethod(), request.getRequestURI());
	}
	
	@ExceptionHandler(Exception.class)
	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
	public ErrorResponse handleExceptions(Exception exception, HttpServletRequest request) {

		return new ErrorResponse(exception.getMessage(), request.getMethod(), request.getRequestURI());
	}
	
	@ExceptionHandler(NotImplementedException.class)
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	public ErrorResponse handleNoImplementedExceptions(NotImplementedException exception, HttpServletRequest request) {
		return new ErrorResponse(exception.getMessage(), request.getMethod(), request.getRequestURI());
	}
}
