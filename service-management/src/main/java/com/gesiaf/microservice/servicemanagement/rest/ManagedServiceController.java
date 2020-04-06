package com.gesiaf.microservice.servicemanagement.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gesiaf.microservice.servicemanagement.model.ManagedServices;
import com.gesiaf.microservice.servicemanagement.services.ManagedServiceBean;

@RestController
@RequestMapping(value="/api")
public class ManagedServiceController {

	@Autowired
	private ManagedServiceBean managedServiceBean;
	
	@PostMapping(value="/managed/services")
	public ManagedServices saveService(ManagedServices managedService) {
		
		managedServiceBean.createServices(managedService);
		
		return managedService;
	}
	
	@GetMapping(value="/managed/services")
	public List<ManagedServices> findAllManagedServices(){
		List<ManagedServices> managedServices = (List<ManagedServices>) managedServiceBean.findAllServices();
		return managedServices;
	}
	
	@GetMapping(value="/managed/services/{id}")
	public ManagedServices findServicesById(@PathVariable Long id) {
		ManagedServices managedServices = managedServiceBean.findServiceById(id);
		return managedServices;
	}
}
