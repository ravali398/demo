package com.May10.pack2;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.May10.pack2.exception.BookCreationException;
import com.May10.pack2.exception.ErrorMessage;
import com.May10.pack2.exception.InvalidBookException;
import com.May10.pack2.exception.InvalidLoginException;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(InvalidBookException.class)
	public @ResponseBody ErrorMessage checkInvalidBookException(InvalidBookException e)
	
	{
		ErrorMessage error1=new ErrorMessage(LocalDateTime.now(), e.getMessage());
		return error1;
	}
	@ExceptionHandler(BookCreationException.class)
	public @ResponseBody ErrorMessage checkBookCreationException(BookCreationException e)
	
	{
		ErrorMessage error1=new ErrorMessage(LocalDateTime.now(),e.getMessage());
		return error1;
	}
	
	@ExceptionHandler(InvalidLoginException.class)
	public ResponseEntity<Object> checkInvalidLogin(InvalidLoginException e)
	{
		
		ErrorMessage responseError=new ErrorMessage(LocalDateTime.now(), e.getMessage());
		ResponseEntity< Object> res=new ResponseEntity<Object>(responseError, HttpStatus.BAD_REQUEST);
		return res;
		
	}
	//validation
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public @ResponseBody ErrorMessage checkBookValidation(MethodArgumentNotValidException e)
	
	{
		ErrorMessage error1=new ErrorMessage(LocalDateTime.now(), e.getMessage(),e.getBindingResult().toString());
		return error1;
	}
	
	
	
	
		 
	}
