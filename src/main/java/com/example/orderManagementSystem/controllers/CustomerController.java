package com.example.orderManagementSystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.orderManagementSystem.entities.Customer;
import com.example.orderManagementSystem.services.CustomerService;

@Controller
public class CustomerController {
	@Autowired CustomerService service;

  @GetMapping("/customer")
  public String customerForm(Model model) {
    model.addAttribute("customer", new Customer());
    return "customer";
  }

  @PostMapping("/customer")
  public String customerSubmit(@ModelAttribute Customer customer, Model model) {
		service.add(customer);
    model.addAttribute("customers", service.getCustomers());
    return "customerTable";
  }

  @GetMapping("/customer-table")
  public String customerTable(Model model) {
    model.addAttribute("customers", service.getCustomers());
    return "customerTable";
  }
}