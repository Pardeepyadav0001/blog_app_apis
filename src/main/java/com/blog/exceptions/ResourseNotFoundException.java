package com.blog.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResourseNotFoundException extends RuntimeException {

	String resourceName;
	String fieldname;
	long fieldValue;
	public ResourseNotFoundException(String resourceName,	String fieldname ,long fieldValue) {
		super(String.format("%s not found with %s: %s",resourceName,fieldname,fieldValue ));
	}
	public ResourseNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	public ResourseNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
	public ResourseNotFoundException(String message) {
		super(message);
	}
	public ResourseNotFoundException(Throwable cause) {
		super(cause);
	}
	
	
}
