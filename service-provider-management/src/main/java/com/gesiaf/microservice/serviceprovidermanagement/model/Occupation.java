package com.gesiaf.microservice.serviceprovidermanagement.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Occupation {

	@Id
	@GeneratedValue
	private Long id;
	
	private String job;
	
	public Occupation() {}
	
	@ManyToMany(fetch= FetchType.LAZY,mappedBy= "occupations")
	private Set<ServiceProvider> service_provider = new HashSet<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Set<ServiceProvider> getService_provider() {
		return service_provider;
	}

	public void setService_provider(Set<ServiceProvider> service_provider) {
		this.service_provider = service_provider;
	}

	public Occupation(Long id, String job) {
		super();
		this.id = id;
		this.job = job;
	}

	@Override
	public String toString() {
		return "Occupation [id=" + id + ", job=" + job + "]";
	}

	
	
	
	
	
}
