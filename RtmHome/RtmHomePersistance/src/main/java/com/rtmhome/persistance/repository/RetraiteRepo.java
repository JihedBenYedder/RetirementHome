package com.rtmhome.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rtmhome.model.RetirementHome;
import com.rtmhome.model.Retraite;


public interface RetraiteRepo extends JpaRepository<Retraite, Long>{

	public Retraite findByIdRetraite(Long idRetraite);
	
	
}
