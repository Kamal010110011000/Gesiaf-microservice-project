package com.gesiaf.microservice.billingservice;

public class ServiceCharge {

	private String service;
	
	private double price;

	
	
	public ServiceCharge() {}

	public ServiceCharge(String service, double price) {
		this.service = service;
		this.price = price;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ServiceCharge [service=" + service + ", price=" + price + "]";
	}
	
	
	
	
}
