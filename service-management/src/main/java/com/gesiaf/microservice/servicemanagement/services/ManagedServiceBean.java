package com.gesiaf.microservice.servicemanagement.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gesiaf.microservice.servicemanagement.model.ManagedServices;
import com.gesiaf.microservice.servicemanagement.repo.ManagedServicesRepository;

@Component
public class ManagedServiceBean {
	
	@Autowired
	private ManagedServicesRepository managedServiceRepository;
	
	public ManagedServices createServices(ManagedServices managedServices) {
		managedServiceRepository.save(managedServices);
		
		return managedServices;
	}
	
	public Iterable<ManagedServices> findAllServices(){
		Iterable<ManagedServices> msList= managedServiceRepository.findAll();
		return msList;
	}
	
	public ManagedServices findServiceById(Long id){
		Optional<ManagedServices> service = managedServiceRepository.findById(id);
		
		return service.get();
	}

}
