package com.idprocess.transport.services;


import java.util.List;

import com.idprocess.transport.model.*;


public interface PassagerService {

	/**
	 * Add Passager
	 * 
	 * @param  Passager Passager
	 */
	String addPassager(Passager passager);
	
	/**
	 * Update Passager
	 * 
	 * @param  Passager Passager
	 */
	public void updatePassager(Passager passager);

	/**
	 * Delete Passager
	 * 
	 * @param  Passager Passager
	 */
	public void deletePassager(Passager passgaer);
	
	
	/**
	 * Get User List
	 * 
	 * @return List - User list
	 */
	public List<Passager> getPassager();
	
	/**
	 * 
	 * @param p
	 * @return
	 */
	public List<Passager> findPassagerByParam(Passager p);
	
	/**
	 * 
	 * @param nom
	 * @param prenom
	 * @return
	 */
	public List<Passager> findPassagerByParam(String nom,String prenom, String ville,String nomorg);

	public List<Passager> findToutPassager();

	public List<Passager> trouve(String nom,String nomOrg);
	
	public List<Passager> passagerExisteDeja(String nom, String prenom, String mail);
	
	
	}


	

