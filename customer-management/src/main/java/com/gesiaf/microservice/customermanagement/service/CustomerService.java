package com.gesiaf.microservice.customermanagement.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gesiaf.microservice.customermanagement.model.Customer;
import com.gesiaf.microservice.customermanagement.repo.CustomerRepository;;

@Component
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public Customer saveCustomers(Customer customer) {
		customerRepository.save(customer);
		return customer;
	}
	
	public Iterable<Customer> getCustomers() {
		Iterable<Customer> iterateCustomer= customerRepository.findAll();
		
		return iterateCustomer;
	}
	
	public Optional<Customer> getCustomer(Long id) {
		Optional<Customer> customers;
		customers = customerRepository.findById(id);
		
		return customers;
	}
}
