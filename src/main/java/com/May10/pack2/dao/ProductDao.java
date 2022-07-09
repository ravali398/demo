package com.May10.pack2.dao;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.May10.pack2.model.Bill;
import com.May10.pack2.model.Product;
import com.May10.pack2.repository.BillRepository;
import com.May10.pack2.repository.ProductRepository;
import com.May10.pack2.service.ProductService;
@Service
public class ProductDao implements ProductService {

	@Autowired
	private ProductRepository repository;
	@Autowired
	private BillRepository  billrepository;
	@Override
	public Product addProduct(Product product) {

 Product p=repository.save(product);
		return p;
	}

	@Override
	public Product getProductByName(String product) {
		// TODO Auto-generated method stub
		Product p1=repository.getProductByProductName(product);
		return p1;
		
	}

	@Override
	public double getProductPrice(String productName) {
		// TODO Auto-generated method stub
		double k=repository.getProductByProductName(productName).getCostPerKg();
		return k;
	}

	@Override
	public List<Product> getAllProudct() {
		// TODO Auto-generated method stub
		List<Product> list	= repository.findAll();
		return list;
			}

	@Override
	public Bill calculateBill(String productName, int quantity) {
		// TODO Auto-generated method stub
		Random rd=new Random();
		Product p=getProductByName(productName);
		double total=(p.getCostPerKg()*quantity);
		Bill b=new Bill();
		b.setBillId(quantity);
		b.setBillDate(LocalDate.now());
		b.setTotalCost(total);
		b.setQuantity(quantity);
		b.setProductName(productName);
		b.setCostPerKg(p.getCostPerKg());
		billrepository.save(b);
		return b;
	}
	
	
}
