package com.gesiaf.microservice.servicemanagement.repo;

import org.springframework.data.repository.CrudRepository;

import com.gesiaf.microservice.servicemanagement.model.ManagedServices;

public interface ManagedServicesRepository extends CrudRepository<ManagedServices,Long>{

}
