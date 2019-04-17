package com.rosslong.assignment2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.rosslong.assignment2.model.Customer;
import com.rosslong.assignment2.repository.CustomerRepository;



public class CustomerService {
	@Autowired
	private CustomerRepository customerRepository;

	public List<Customer> getAllCustomers(){
		List<Customer> customers = new ArrayList<>();
		customerRepository.findAll()
		.forEach(customers::add);
		return customers;
		
	}

	public Customer addCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	public Customer getCustomer(Customer customer) {
		List<Customer> customers = getAllCustomers();
		for(Customer c : customers) {
			
			if(c.getEmail().equals(customer.getEmail()) && c.getPassword().equals(customer.getPassword())){
				return c;
				
			}
		}
		
		return new Customer();
	}
}
