package com.metric.converter.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorResponse {

	private final String error;
	private final String requestMethod;
	private final String requestURL;
	
}
