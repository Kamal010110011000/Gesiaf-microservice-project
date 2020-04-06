package com.gesiaf.microservice.billingservice;

import java.sql.Time;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BillingServiceController {
	
	@Autowired
	private ServiceManagementProxy proxy;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@GetMapping("/api/generate/bill/of/{id}")
	public BillingBean generateBill(@PathVariable("id") Long id) {
		
		BillingBean response = proxy.retrieveBillingDetails(id);
		
		List<ServiceCharge> serviceCharge = response.getService_charges();
		Long _customer_id = response.getUserId();
		Long _service_id = response.getServiceId();
		Long _provider_id = response.getServiceProviderId();
		Date _date = response.getDate();
		Time _s_time= response.getStart_time();
		Time _e_time= response.getEnd_time();
		double _total = calculateTotal(serviceCharge);
		double _sgst = (_total * 8)/100;
		double _cgst = (_total * 8)/100;
		
		logger.info("{}", response);
		
		return new BillingBean(_customer_id, _provider_id, _service_id, _date, _s_time, _e_time, serviceCharge, _total, _sgst, _cgst);
	}
	
	public double calculateTotal(List<ServiceCharge> serviceCharge) {
		
		double sum=0;
		for(ServiceCharge charge: serviceCharge) {
			sum+=charge.getPrice();
		}
		
		return sum;
	}
}

