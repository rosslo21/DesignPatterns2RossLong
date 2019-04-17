package com.rosslong.assignment2.repository;

import org.springframework.data.repository.CrudRepository;

import com.rosslong.assignment2.model.Customer;


public interface CustomerRepository extends CrudRepository<Customer, Long> {

}