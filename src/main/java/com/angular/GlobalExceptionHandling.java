package com.angular;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice

public class GlobalExceptionHandling {
//	@ExceptionHandler(value =NoNameException.class)
//	public ResponseEntity<Object> nameException(NoNameException na){
//		return new ResponseEntity <>(na.getMessage(),HttpStatus.NOT_FOUND);
//	}
		@ExceptionHandler(value =AgeException.class)
		public ResponseEntity<Object> ageException(AgeException na){
			return new ResponseEntity <>(na.getMessage(),HttpStatus.NOT_FOUND);
		}

}
