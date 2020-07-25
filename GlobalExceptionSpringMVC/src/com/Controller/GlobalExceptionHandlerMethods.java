package com.Controller;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandlerMethods {
	
	@ExceptionHandler(value=NullPointerException.class) 
	public String handleNullPointerException(Exception e) {
	 
	 
	 System.out.println("null point exception occured :"+e); 
	 return "NullPointerException"; 
	 }

	@ExceptionHandler(value=IOException.class) 
	public String handleIOException(Exception e) {
	 
	 
	 System.out.println("IO exception occured :"+e); 
	 return "IOException"; 
	 }
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=Exception.class)
	public String handleException(Exception e) {
		
	
		System.out.println("unknown exception occured :"+e);
		return "Exception";
	}

}
