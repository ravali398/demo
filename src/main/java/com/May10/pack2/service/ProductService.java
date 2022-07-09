package com.May10.pack2.service;

import java.util.List;

import com.May10.pack2.model.Bill;
import com.May10.pack2.model.Product;

public interface ProductService {
	public Product addProduct(Product product);
	public Product getProductByName(String product);
	public double getProductPrice(String productName);
	public List<Product> getAllProudct();
	public Bill calculateBill(String productName,int quantity );
}
