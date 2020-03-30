package com.gesiaf.microservice.customermanagement.repo;

import org.springframework.data.repository.CrudRepository;

import com.gesiaf.microservice.customermanagement.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long>{

}
