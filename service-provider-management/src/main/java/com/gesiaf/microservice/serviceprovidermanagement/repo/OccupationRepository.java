package com.gesiaf.microservice.serviceprovidermanagement.repo;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gesiaf.microservice.serviceprovidermanagement.model.Occupation;

@Transactional
@Repository
public interface OccupationRepository extends CrudRepository<Occupation, Long>{

}
