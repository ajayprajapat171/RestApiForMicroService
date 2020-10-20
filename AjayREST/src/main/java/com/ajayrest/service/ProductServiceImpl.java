package com.ajayrest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajayrest.model.Product;
import com.ajayrest.repository.ProductRepository;





@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productrepo;
	

	@Override
	public List<Product> startbuy() throws Exception{
		
		return productrepo.findAll();
	}

	@Override
	public Product endbyId(int theId) throws Exception {
		
     Optional<Product> result = productrepo.findById(theId);
		
		Product theProduct= null;
		
		if (result.isPresent()) {
			theProduct = result.get();
		}
		else {
			
			throw new RuntimeException("Did not find Product id - " + theId);
		}
		
		return theProduct;
	}

	 

	
}
