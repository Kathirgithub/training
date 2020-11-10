package com.bosch.training.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

	@ExceptionHandler(value = EmployeeNotFoundException.class)
	public ResponseEntity<Object> empNotFound(EmployeeNotFoundException exc){
		return new ResponseEntity(exc.getMessage(), HttpStatus.NOT_FOUND);
	}
}
