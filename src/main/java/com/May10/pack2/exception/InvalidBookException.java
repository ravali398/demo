package com.May10.pack2.exception;

public class InvalidBookException  extends Exception{
	public InvalidBookException()
	{
		super();
	}
	public InvalidBookException(String errorMsg)
	{
		super(errorMsg);
	}

}
