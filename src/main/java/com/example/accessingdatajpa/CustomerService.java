package com.example.accessingdatajpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
