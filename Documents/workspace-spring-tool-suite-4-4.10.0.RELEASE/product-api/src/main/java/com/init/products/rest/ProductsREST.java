package com.init.products.rest;


import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.init.products.entitys.Product;


//Vamos a exponer todos los servicios REST que queremos que tenga nuestra API

@RestController
@RequestMapping("products")
public class ProductsREST {
	
	@GetMapping 
	public ResponseEntity<List<Product>> getProduct(){
		return null;
		//return ResponseEntity.ok();
	}
	
	//@GetMapping 
	//@RequestMapping(value="hello", method=RequestMethod.GET)
	public String hello() {
		return "Hello world"; 
	}
	
	
}
