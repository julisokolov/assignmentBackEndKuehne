package com.example.orderManagementSystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.orderManagementSystem.entities.Customer;
import com.example.orderManagementSystem.repositories.CustomerRepository;

@Component
public class CustomerService {
	@Autowired CustomerRepository repository;

	public List<Customer> getCustomers() {
		return (List<Customer>) repository.findAll();
	}

	public void add(Customer customer) {		
		repository.save(customer);
	}
}
