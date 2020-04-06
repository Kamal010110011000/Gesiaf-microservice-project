package com.gesiaf.microservice.billingservice;

import java.sql.Time;
import java.util.Date;
import java.util.List;


public class BillingBean {
	
	private Long serviceProviderId;
	
	private Long serviceId;
	
	private Long userId;
	
	private Date date;
	
	private Time start_time;
	
	private Time end_time;
	
	private List<ServiceCharge> service_charges;
	
	private double total;
	
	private double sgst;
	
	private double cgst;
	
	
	public BillingBean() {}


	public BillingBean(Long serviceProviderId, Long serviceId, Long userId, Date date, Time start_time,
			Time end_time, List<ServiceCharge> service_charges, double total, double sgst, double cgst) {
		this.serviceProviderId = serviceProviderId;
		this.serviceId = serviceId;
		this.userId = userId;
		this.date = date;
		this.start_time = start_time;
		this.end_time = end_time;
		this.service_charges = service_charges;
		this.total = total;
		this.sgst = sgst;
		this.cgst = cgst;
	}

	public Long getServiceProviderId() {
		return serviceProviderId;
	}


	public void setServiceProviderId(Long serviceProviderId) {
		this.serviceProviderId = serviceProviderId;
	}


	public Long getServiceId() {
		return serviceId;
	}


	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
	}


	public Long getUserId() {
		return userId;
	}


	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Time getStart_time() {
		return start_time;
	}


	public void setStart_time(Time start_time) {
		this.start_time = start_time;
	}


	public Time getEnd_time() {
		return end_time;
	}


	public void setEnd_time(Time end_time) {
		this.end_time = end_time;
	}

	public double getTotal() {
		return total;
	}


	public void setTotal(double total) {
		this.total = total;
	}


	public double getSgst() {
		return sgst;
	}


	public void setSgst(double sgst) {
		this.sgst = sgst;
	}


	public double getCgst() {
		return cgst;
	}


	public void setCgst(double cgst) {
		this.cgst = cgst;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public List<ServiceCharge> getService_charges() {
		return service_charges;
	}


	public void setService_charges(List<ServiceCharge> service_charges) {
		this.service_charges = service_charges;
	}

	
	
}
