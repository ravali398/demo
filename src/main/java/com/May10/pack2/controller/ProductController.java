package com.May10.pack2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.May10.pack2.dao.ProductDao;
import com.May10.pack2.model.Bill;
import com.May10.pack2.model.Product;

@RestController
public class ProductController {
		
	@Autowired
	private ProductDao dao;
	@PostMapping(path = "/createProduct")
	public Product createProduct(@RequestBody Product product)
	{
		return	dao.addProduct(product);
	}
	@GetMapping(path="/getAllProducts")
	public List<Product> getAllProduct()
	{
		return dao.getAllProudct();
	}
	
	@GetMapping(path="/getSingleProductByName/{pName}")
	public Product getProductByName(@PathVariable String pName)
	{
		return dao.getProductByName(pName);
	}
	@GetMapping(path="/getSingleProductPrice/{pName1}")
	public double getProductPrice(@PathVariable String pName1  )
	{
		return dao.getProductPrice(pName1);
	}
	@GetMapping(path="/getProductBill/{pName2}/{pQuantity}")
	public Bill CalculateBill(@PathVariable String pName2, @PathVariable int pQuantity )
	{
		return dao.calculateBill(pName2, pQuantity);
	}

}

