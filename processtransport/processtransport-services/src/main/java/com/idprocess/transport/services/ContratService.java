package com.idprocess.transport.services;

import java.util.List;

import com.idprocess.transport.model.Contrat;

public interface ContratService {
 
	/**
	 * 
	 * @param contrat
	 */
	public void addContrat(Contrat contrat);
	/**
	 * 
	 * @param contrat
	 */
	public void updateContrat(Contrat contrat);
	/**
	 * 
	 * @param contrat
	 */
	public void deleteContrat(Contrat contrat);
	
	/**
	 * 
	 * @param type
	 * @param nomP
	 * @return
	 */
	public List<Contrat> findByTypeContratLikeAndPassagerNomLike(String type,String nomP, String nomC);

	
	

}
