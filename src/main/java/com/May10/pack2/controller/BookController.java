package com.May10.pack2.controller;

import java.util.List;

import javax.validation.Valid;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.May10.pack2.dao.BookDao;
import com.May10.pack2.exception.BookCreationException;
import com.May10.pack2.exception.InvalidBookException;
import com.May10.pack2.model.Book;

@RestController
public class BookController {
@Autowired
BookDao dao;
@PostMapping(path="/createBook")
public Book createBook(@Valid @RequestBody Book book) throws BookCreationException
{
	
	Book b=dao.addBook(book);
	if(b!=null)
	{
		System.out.println("Book Object created");
	}
	else
	{
		System.out.println("not able to create book object");
	}
	return b;
	
}
	
@GetMapping(path="/getAllBook/{s}/{e}/{sortBy}")
public List<Book> getAllBook(@PathVariable int s, @PathVariable int e,@PathVariable String sortBy)
{
		return dao.getAllBook(s, e, sortBy);
}
@GetMapping(path="/sortByName")
public List<Book> sortBook()
{
	return dao.sortName();
}
@PutMapping(path="/updateBookById")
public int updateBook( @Valid @RequestBody Book book) throws InvalidBookException
{
	return dao.updateBook(book, book.getBookId());
}


}
