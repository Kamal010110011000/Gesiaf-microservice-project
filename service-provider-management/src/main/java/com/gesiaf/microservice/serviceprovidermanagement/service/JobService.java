package com.gesiaf.microservice.serviceprovidermanagement.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gesiaf.microservice.serviceprovidermanagement.model.Occupation;
import com.gesiaf.microservice.serviceprovidermanagement.model.ServiceProvider;
import com.gesiaf.microservice.serviceprovidermanagement.repo.OccupationRepository;

@Component
public class JobService {
	
	@Autowired
	private OccupationRepository occupationRepository;
	
	public Occupation save(Occupation occupation) {
		occupationRepository.save(occupation);
		
		return occupation;
	}
	
	public Iterable<Occupation> getOccupations(){
		Iterable<Occupation> occupations;
		
		occupations = occupationRepository.findAll();
		
		return occupations;
	}
	
	public Optional<Occupation> getOccupation(Long id){
		Optional<Occupation> occupation;
		
		occupation = occupationRepository.findById(id);
		
		return occupation;
	}
	
	public Iterable<ServiceProvider> getJobProviders(Long id){
		Iterable<ServiceProvider> jobProviders;
		Optional<Occupation> job;
		job = occupationRepository.findById(id);
		jobProviders = job.get().getService_provider();
		
		return jobProviders;
	}

}
