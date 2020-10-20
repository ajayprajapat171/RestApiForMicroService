package com.ajayrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ajayrest.config.AsynicConfig;
import com.ajayrest.service.ProductService;


@RestController
@RequestMapping("/product")
public class ProductController {
	
   	
   	@Autowired
   	private AsynicConfig asynicConfig ;
		
	 @GetMapping("/startbuy")
	 public void operationStart() throws Exception {
		 
		 		 
		  asynicConfig.someAsyncMethod();
		 
	 }
	 
	 @GetMapping("/endbuy")
	 public void endById(@RequestParam("id") int theId) throws Exception{
		
		 
		  asynicConfig.endAsyncMethod(theId);
		 
		 
	 }
	 
	 
	 
}
