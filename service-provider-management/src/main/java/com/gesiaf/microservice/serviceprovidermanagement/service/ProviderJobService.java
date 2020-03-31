package com.gesiaf.microservice.serviceprovidermanagement.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gesiaf.microservice.serviceprovidermanagement.model.ServiceProvider;
import com.gesiaf.microservice.serviceprovidermanagement.repo.ServiceProviderRepository;

@Component
public class ProviderJobService {

	@Autowired
	private ServiceProviderRepository serviceProviderRepository;
	
	public void saveProvider(ServiceProvider serviceProvider) {
		serviceProviderRepository.save(serviceProvider);
	}
	
	public Iterable<ServiceProvider> getServiceProviders(){
		Iterable<ServiceProvider> serviceProviders;
		
		serviceProviders = serviceProviderRepository.findAll();
		
		return serviceProviders;
	}
	
	public Optional<ServiceProvider> getServiceProvider(Long id){
		Optional<ServiceProvider> serviceProvider;
		
		serviceProvider= serviceProviderRepository.findById(id);
		
		return serviceProvider;
	}
}
