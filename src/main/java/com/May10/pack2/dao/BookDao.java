package com.May10.pack2.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.May10.pack2.controller.BookController;
import com.May10.pack2.exception.BookCreationException;
import com.May10.pack2.exception.InvalidBookException;
import com.May10.pack2.model.Book;
import com.May10.pack2.repository.AdminRepository;
import com.May10.pack2.repository.BookRepository;
import com.May10.pack2.service.BookService;
@Service
public class BookDao implements BookService {
	@Autowired
	BookRepository bookRepos;
	@Autowired
	AdminDao dao;
	public String readInput()
	{
		Scanner scanner =new Scanner(System.in);
	     System.out.println("Enter admin Id");
	     int adminId=Integer.parseInt(scanner.nextLine());
	     System.out.println("Enter user name");
		String userName=scanner.nextLine();
	     System.out.println("Enter password");
	     String password=scanner.nextLine();
	 return adminId + " "+userName + " "+password;	
	}
	
	@Override
	public Book addBook(Book book) throws BookCreationException {
		String input=readInput();
		String[] strInput=input.split(" ");
		int adminId=Integer.parseInt(strInput[0]);
		String userName=strInput[1];
		String password=strInput[2];
	if(dao.getAdminName(adminId).equals(userName) && dao.getAdminPassword(adminId).equals(password))
		{
		if(bookRepos.existsById(book.getBookId()))
		{
			throw new BookCreationException("This book is available");
		}
		else 
		{
		return 	bookRepos.save(book);
		}
			
		}
		return null;
		
	}

	@Override
	public List<Book> getAllBook(int pagestart, int pageEnd, String sortBy) {
	
		String input=readInput();
		String[] strInput=input.split(" ");
		int adminId=Integer.parseInt(strInput[0]);
		String userName=strInput[1];
		String password=strInput[2];
		if(dao.getAdminName(adminId).equals(userName) && dao.getAdminPassword(adminId).equals(password))
			
		{
			Pageable paging = PageRequest.of(pagestart, pageEnd, Sort.by(sortBy).descending());
			 
	        Page<Book> pagedResult = bookRepos.findAll(paging);
	         
	        if(pagedResult.hasContent()) {
	            return pagedResult.getContent();
	        }
	        else {
	            return new ArrayList<Book>();
	        }
			
			
		}
		else
		{
			System.out.println("Invalid login exception");
			return null;
		}
	 
      
	}

	public   List<Book> sortName()
      {
      	Sort sort=Sort.by("bookName");
      	return (List<Book>) bookRepos.findAll(sort);
      }

	@Override
	public int updateBook(Book book, long bookId) throws InvalidBookException {
		int status=0;
		if(bookRepos.existsById(bookId))
		{
		String bookName=book.getBookName();
		double bookPrice=book.getBookPrice();
	 status=bookRepos.UpdateBookById(bookName,bookPrice, bookId);
		}
		else
		{
			throw new InvalidBookException("Book id is not available");
		}
		return status;
	}
}
