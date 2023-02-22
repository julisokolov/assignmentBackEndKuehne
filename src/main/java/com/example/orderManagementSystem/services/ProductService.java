package com.example.orderManagementSystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.orderManagementSystem.repositories.ProductRepository;
import com.example.orderManagementSystem.entities.Product;

@Component
public class ProductService {
	@Autowired ProductRepository repository;

	public List<Product> getProducts() {
		return (List<Product>) repository.findAll();
	}

	public void add(Product product) {		
		repository.save(product);
	}
}
