package com.gesiaf.microservice.serviceprovidermanagement.rest;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.gesiaf.microservice.serviceprovidermanagement.model.Occupation;
import com.gesiaf.microservice.serviceprovidermanagement.model.ServiceProvider;
import com.gesiaf.microservice.serviceprovidermanagement.service.JobService;

@RestController
@RequestMapping("/api")
public class JobRestController {
	
	@Autowired
	private JobService jobService; 
	
	@PostMapping(value="/services")
	public ResponseEntity<Occupation> addServices(Occupation occupation){
		Occupation saveJob = jobService.save(occupation);
		
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(saveJob.getId())
				.toUri();
		
		return ResponseEntity.created(location).build();
	}
	
	@GetMapping(value="/services")
	public List<Occupation> allServices(){
		return (List<Occupation>)jobService.getOccupations();
	}
	
	@GetMapping(value="/services/{id}")
	public Occupation findService(@PathVariable Long id) {
		Optional<Occupation> jobs = jobService.getOccupation(id);
		
		if(!jobs.isPresent())
			System.out.println("not found");
		
		return jobs.get();
	}
	
	@GetMapping(value="/services/{id}/providers")
	public Iterable<ServiceProvider> findJobProviders(@PathVariable Long id){
		Iterable<ServiceProvider> jobProviders = jobService.getJobProviders(id);
		
		return jobProviders;
	}
}
