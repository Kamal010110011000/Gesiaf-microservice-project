package com.gesiaf.microservice.servicemanagement.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ManagedServices {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private Long userId;
	
	private Long serviceProviderId;
	
	private Long serviceId;
	
	private Date date;
	
	private String jobDesc;
	
	private double payment;
	
	private String paymentType;
	
	

	public ManagedServices() {	}

	public ManagedServices(Long id, Long userId, Long serviceProviderId, Long serviceId, Date date, String jobDesc,
			double payment, String paymentType) {
		super();
		this.id = id;
		this.userId = userId;
		this.serviceProviderId = serviceProviderId;
		this.serviceId = serviceId;
		this.date = date;
		this.jobDesc = jobDesc;
		this.payment = payment;
		this.paymentType = paymentType;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getJobDesc() {
		return jobDesc;
	}

	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}

	public double getPayment() {
		return payment;
	}

	public void setPayment(double payment) {
		this.payment = payment;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	@Override
	public String toString() {
		return "ManagedServices [id=" + id + ", userId=" + userId + ", serviceProviderId=" + serviceProviderId
				+ ", serviceId=" + serviceId + ", date=" + date + ", jobDesc=" + jobDesc + ", payment=" + payment
				+ ", paymentType=" + paymentType + "]";
	}
	
	
}
