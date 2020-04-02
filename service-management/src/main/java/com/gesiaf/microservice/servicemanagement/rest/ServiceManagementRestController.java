package com.gesiaf.microservice.servicemanagement.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.gesiaf.microservice.servicemanagement.ServiceManagementProxy;
import com.gesiaf.microservice.servicemanagement.model.ServiceManagement;

@RestController
public class ServiceManagementRestController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private ServiceManagementProxy proxy; 
	
	@GetMapping("/customer/{id}/service/manage")
	public ServiceManagement retrieveService(@PathVariable("id") Long c_id) {
		
		ServiceManagement response1 = proxy.retrieveCustomerValue(c_id);
		
//		ServiceManagement response2 = proxy.retrieveServiceValue(s_id);
		
		logger.info("{}", response1);
		
		return new ServiceManagement(response1.getId(),response1.getName(),response1.getPhone(),response1.getEmail());
		
	}
}
