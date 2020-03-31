package com.gesiaf.microservice.serviceprovidermanagement.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ServiceProviderRestController {
	
	

	@PostMapping(value="service-provider")
	public void addServiceProvider() {
		
	}
}
