package com.ajayrest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String custumerName;
	String productName;
	int price;
	
	public Product(int id, String custumerName, String productName, int price) {
		super();
		this.id = id;
		this.custumerName = custumerName;
		this.productName = productName;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustumerName() {
		return custumerName;
	}
	public void setCustumerName(String custumerName) {
		this.custumerName = custumerName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public Product() {
		
	}
	
	public void run() throws InterruptedException {
		custumerName.wait();
		
	}

}
