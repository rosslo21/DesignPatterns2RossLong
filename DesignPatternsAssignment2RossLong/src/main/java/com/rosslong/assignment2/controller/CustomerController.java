package com.rosslong.assignment2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rosslong.assignment2.model.Customer;
import com.rosslong.assignment2.service.CustomerService;



public class CustomerController {

	
	@Autowired
	private CustomerService customerService ;
	
	@RequestMapping(value = "/allCustomers", method = RequestMethod.GET)
	public List<Customer> getAllEmployees() {
		return customerService.getAllCustomers();
	}
	
	@RequestMapping(value = "/registerCustomer", method = RequestMethod.POST)
	public Customer registerCustomer(@RequestBody Customer customer) {
		return customerService.addCustomer(customer);
	}
	
	@RequestMapping(value = "/loginCustomer", method = RequestMethod.POST)
	public Customer loginCustomer(@RequestBody Customer customer) {
		return customerService.getCustomer(customer);
	}
	
	
}
