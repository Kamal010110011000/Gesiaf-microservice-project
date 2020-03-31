package com.gesiaf.microservice.serviceprovidermanagement.model;

public class Address {

	private String house_no;
	
	private String locality;
	
	private String city;
	
	private String state;
	
	private String country;
	
	private int pin;

	public Address() {}
	
	public Address(String house_no, String locality, String city, String state, String country, int pin) {
		super();
		this.house_no = house_no;
		this.locality = locality;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pin = pin;
	}

	public String getHouse_no() {
		return house_no;
	}

	public void setHouse_no(String house_no) {
		this.house_no = house_no;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	
	
	
	
}
