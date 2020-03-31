package com.gesiaf.microservice.customermanagement.RestController;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.gesiaf.microservice.customermanagement.model.Customer;
import com.gesiaf.microservice.customermanagement.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerRestController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping(value="/customers")
	public ResponseEntity<Object> createCustomer(@RequestBody Customer customer){
		
		Customer savedCustomer = customerService.saveCustomers(customer);
		
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(savedCustomer.getId())
				.toUri();
		
		return ResponseEntity.created(location).build();
		
	}
	
	@GetMapping(value="/customers")
	public List<Customer> getAllCustomers(){
		return (List<Customer>)customerService.getCustomers();
	}
	
	@GetMapping(value="/customers/{id}")
	public Customer getCustomer(@PathVariable Long id) {
		Optional<Customer> customer =  customerService.getCustomer(id);
		
//		if(!customer.isPresent())
//			throw new UserNotFountException("id-"+id);
		
		return customer.get();
		
	}
	
	

}
