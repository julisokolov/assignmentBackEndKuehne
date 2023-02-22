package com.example.orderManagementSystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.orderManagementSystem.entities.Product;
import com.example.orderManagementSystem.services.ProductService;

@Controller
public class ProductController {
	@Autowired ProductService service;

  @GetMapping("/product")
  public String productForm(Model model) {
    model.addAttribute("product", new Product());
    return "product";
  }

  @PostMapping("/product")
  public String productSubmit(@ModelAttribute Product product, Model model) {
		service.add(product);
    model.addAttribute("products", service.getProducts());
    return "productTable";
  }
}