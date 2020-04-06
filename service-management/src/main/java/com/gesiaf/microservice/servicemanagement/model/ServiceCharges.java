package com.gesiaf.microservice.servicemanagement.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class ServiceCharges {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String service;
	
	private double price;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonIgnore
	private ManagedServices managed_services;
	
	public ServiceCharges() {}

	public ServiceCharges(Long id, String service, double price) {
		this.id = id;
		this.service = service;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public ManagedServices getManaged_services() {
		return managed_services;
	}

	public void setManaged_services(ManagedServices managed_services) {
		this.managed_services = managed_services;
	}

	@Override
	public String toString() {
		return "ServiceCharges [id=" + id + ", service=" + service + ", price=" + price + "]";
	}

}
