package com.gesiaf.microservice.customermanagement.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	private String email;
	
	private String password;
	
	private Date dob;
	
	private Long phone;
	
	private Address address;
	
	public Customer() {}

	public Customer(Long id, String name, String email, Date dob, Long phone, Address address,String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.phone = phone;
		this.password = password;
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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
