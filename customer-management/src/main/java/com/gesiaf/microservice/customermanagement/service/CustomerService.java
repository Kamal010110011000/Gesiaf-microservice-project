package com.gesiaf.microservice.customermanagement.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.gesiaf.microservice.customermanagement.model.Customer;
import com.gesiaf.microservice.customermanagement.repo.CustomerRepository;;

public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public void saveCustomers(Customer customer) {
		customerRepository.save(customer);
	}
	
	public Iterable<Customer> getCustomers() {
		Iterable<Customer> iterateCustomer= customerRepository.findAll();
		
		return iterateCustomer;
	}
	
	public Optional<Customer> getCustomer(Long id) {
		Optional<Customer> customer;
		customer = customerRepository.findById(id);
		
		return customer;
	}
}
