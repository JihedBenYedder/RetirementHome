package com.rtmhome.persistance;

import org.springframework.data.repository.CrudRepository;

import com.rtmhome.model.Retraite;

public interface RetraiteRepo extends CrudRepository<Retraite, Long> {

	public Retraite findByIdRetraite(Long idRetraite);
	
	
	
	
}
