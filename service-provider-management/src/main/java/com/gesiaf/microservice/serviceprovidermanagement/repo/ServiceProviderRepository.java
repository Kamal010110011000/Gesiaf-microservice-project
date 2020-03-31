package com.gesiaf.microservice.serviceprovidermanagement.repo;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gesiaf.microservice.serviceprovidermanagement.model.ServiceProvider;

@Transactional
@Repository
public interface ServiceProviderRepository extends CrudRepository<ServiceProvider, Long>{

}
