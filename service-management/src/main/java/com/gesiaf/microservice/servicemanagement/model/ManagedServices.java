package com.gesiaf.microservice.servicemanagement.model;

import java.sql.Time;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ManagedServices {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private Long userId;
	
	private Long serviceProviderId;
	
	private Long serviceId;
	
	private Date date;
	
	private Time start_time;
	
	private Time end_time;
	
	@OneToMany(mappedBy = "managed_services")
	private List<ServiceCharges> service_charges;
	
	public ManagedServices() {	}
	

	public ManagedServices(Long id, Long userId, Long serviceProviderId, Long serviceId, Date date, Time start_time,
			Time end_time) {
		super();
		this.id = id;
		this.userId = userId;
		this.serviceProviderId = serviceProviderId;
		this.serviceId = serviceId;
		this.date = date;
		this.start_time = start_time;
		this.end_time = end_time;
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

	public Date getStart_time() {
		return start_time;
	}

	public void setStart_time(Time start_time) {
		this.start_time = start_time;
	}

	public Date getEnd_time() {
		return end_time;
	}

	public void setEnd_time(Time end_time) {
		this.end_time = end_time;
	}

	public List<ServiceCharges> getService_charges() {
		return service_charges;
	}

	public void setService_charges(List<ServiceCharges> service_charges) {
		this.service_charges = service_charges;
	}

	
	
}
