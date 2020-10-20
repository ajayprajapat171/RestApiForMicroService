package com.ajayrest.service;

import java.util.List;

import com.ajayrest.model.Product;

public interface ProductService {
	
	public List<Product> startbuy() throws Exception;
	
	public Product endbyId(int theId) throws Exception;

}
