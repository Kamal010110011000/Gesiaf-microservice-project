package com.gesiaf.microservice.serviceprovidermanagement.rest;

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

import com.gesiaf.microservice.serviceprovidermanagement.model.ServiceProvider;
import com.gesiaf.microservice.serviceprovidermanagement.service.ProviderJobService;

@RestController
@RequestMapping("/api")
public class ServiceProviderRestController {
	
	@Autowired
	private ProviderJobService providerService;

	@PostMapping(value="service-providers")
	public ResponseEntity<Object> addServiceProvider(@RequestBody ServiceProvider serviceProvider) {
		
		ServiceProvider savedServiceProvider= providerService.saveProvider(serviceProvider);
		
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(savedServiceProvider.getId())
				.toUri();
		
		return ResponseEntity.created(location).build();
	}
	
	@GetMapping(value="service-providers")
	public List<ServiceProvider> allServiceProviders(){
		return (List<ServiceProvider>) providerService.getServiceProviders();
	}
	
	
	@GetMapping(value="service-providers/{id}")
	public ServiceProvider getServiceProvider(@PathVariable Long id) {
		Optional<ServiceProvider> serviceProvider= providerService.getServiceProvider(id);
		if(!serviceProvider.isPresent())
			System.out.println("not found");
		return serviceProvider.get();
		
	}
	
}
