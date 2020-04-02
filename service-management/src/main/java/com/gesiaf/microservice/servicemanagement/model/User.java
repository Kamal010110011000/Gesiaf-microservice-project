package com.gesiaf.microservice.servicemanagement.model;

public class User {

	private Long id;
	
	private String name;
	
	private String phone_no;
	
	private String email;
	
	

	public User(Long id, String name, String phone_no, String email) {
		super();
		this.id = id;
		this.name = name;
		this.phone_no = phone_no;
		this.email = email;
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

	public String getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
