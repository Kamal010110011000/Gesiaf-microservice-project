package com.gesiaf.microservice.billingservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="api-gateway-server")
@RibbonClient(name="service-management")
public interface ServiceManagementProxy {

	@GetMapping(value="/service-management/api/managed/services/{id}")
	public BillingBean retrieveBillingDetails(@PathVariable("id") Long id);
}
