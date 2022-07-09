package com.May10.pack2.repository;
import com.May10.pack2.model.Book;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.transaction.annotation.Transactional;

public interface BookRepository extends PagingAndSortingRepository <Book,Long>{
@Transactional
@Modifying
@Query(value = "update  Book b set b.bookName =?1, b.bookPrice=?2 where b.bookId=?3")
public int UpdateBookById(String bookName,double bookPrice,long bookId);	


}
