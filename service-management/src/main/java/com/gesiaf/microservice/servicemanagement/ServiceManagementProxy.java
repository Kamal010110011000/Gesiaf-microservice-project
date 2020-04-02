package com.gesiaf.microservice.servicemanagement;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.gesiaf.microservice.servicemanagement.model.ServiceManagement;


@FeignClient(name="api-gateway-server")
@RibbonClient(name="customer-management")
public interface ServiceManagementProxy {

//	@GetMapping("/service-provider-management/services/{id}/providers")
//	public ServiceManagement retrieveExchangeValue(@PathVariable("id") Long id );
	
	@GetMapping("/customer-management/api/customers/{id}")
	public ServiceManagement retrieveCustomerValue(@PathVariable("id") Long id );
	
}
