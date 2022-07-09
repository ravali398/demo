package com.May10.pack2.model;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

	@Entity
	@Table(name="Product_Table_Fruit")
	public class Product {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long productId;
		private String productName;
		private double costPerKg;
		public long getProductId() {
			return productId;
		}
		public void setProductId(long productId) {
			this.productId = productId;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public double getCostPerKg() {
			return costPerKg;
		}
		public void setCostPerKg(double costPerKg) {
			this.costPerKg = costPerKg;
		}
		
}
