package com.example.orderManagementSystem.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.orderManagementSystem.entities.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
  Product findById(long id);
}