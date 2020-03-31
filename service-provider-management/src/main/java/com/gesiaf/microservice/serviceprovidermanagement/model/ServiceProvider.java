package com.gesiaf.microservice.serviceprovidermanagement.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class ServiceProvider {

	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	private String email;
	
	private Long phone;
	
	private Address address;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name= "occupation_service", 
			joinColumns = @JoinColumn(name = "provider_id", referencedColumnName = "id"),
	        inverseJoinColumns = @JoinColumn(name = "occupation_id", referencedColumnName = "id"))
	private Set<Occupation> occupations;
	
	

	public ServiceProvider(Long id, String name, String email, Long phone, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Set<Occupation> getOccupations() {
		return occupations;
	}

	public void setOccupations(Set<Occupation> occupations) {
		this.occupations = occupations;
	}

	@Override
	public String toString() {
		return "ServiceProvider [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}
	
	
	
	
	
	
}
