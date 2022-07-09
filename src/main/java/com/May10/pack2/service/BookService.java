package com.May10.pack2.service;

import java.util.List;

import com.May10.pack2.exception.BookCreationException;
import com.May10.pack2.exception.InvalidBookException;
import com.May10.pack2.model.Book;

public interface BookService {
	public Book addBook(Book book) throws BookCreationException;
	public List<Book> getAllBook(int pagestart, int pageEnd, String sortBy);
	public int updateBook(Book book, long bookId)throws InvalidBookException;
	
}

