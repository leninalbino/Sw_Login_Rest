package com.example.appbackend.Response;

import com.example.appbackend.Response.BadRequestException;
import com.example.appbackend.Response.NotFountException;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@Transactional
@ControllerAdvice(annotations = RestController.class)
public class ExceptionConfig {

	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<?> notFoundException(Exception e){
		return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		
	}
	
	@ExceptionHandler(BadRequestException.class)
	public ResponseEntity<?> badRequestException(Exception e){
		return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		
	}


}
