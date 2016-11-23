package com.rtmhome.persistance.repository;

import org.springframework.data.repository.CrudRepository;

import com.rtmhome.model.RetirementHome;

public interface RetirementHomeRepo extends CrudRepository<RetirementHome, Long>{

	public RetirementHome findByIdRetirementHome(Long idRetirementHome);
	
	
}
