package com.May10.pack2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.May10.pack2.model.Bill;
import com.May10.pack2.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	@Query(value = "select p from Product p where p. productName=:param1")
public Product getProductByProductName(@Param("param1")String ProductName);
	
	/*@Query(value="Select q from Product q where q.productName=:param2 and r from Bill r where r.quantity=:param3")
	public  Bill calculateBill(@Param("param2")String ProductName, @Param("param3")int quantity );*/
	
	
	
}

