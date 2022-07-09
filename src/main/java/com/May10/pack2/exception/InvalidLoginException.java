package com.May10.pack2.exception;

public class InvalidLoginException extends RuntimeException {
	
	
	public InvalidLoginException(String error)
	{
		super(error);
	}

}

