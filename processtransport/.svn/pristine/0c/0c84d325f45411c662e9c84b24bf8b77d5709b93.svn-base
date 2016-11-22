package com.idprocess.transport.services;


import java.util.List;

import com.idprocess.transport.model.*;

public interface ClientService {
	
	/**
	 * Add Client
	 * 
	 * @param  Client client
	 */
	String addClient(Client client);
	
	/**
	 * Update Client
	 * 
	 * @param  Client client
	 */
	public void updateClient(Client client);

	/**
	 * Delete Client
	 * 
	 * @param  Client client
	 */
	public void deleteClient(Client client);
	
	
	/**
	 * Get User List
	 * 
	 * @return List - User list
	 */
	public List<Client> getClient();
	
	
	/**
	 * 
	 * @param c
	 * @return
	 */
	public List<Client> findClientByMultiParam(Client c);
	
	/**
	 * 
	 * @param c
	 * @return liste des clients particuliers
	 */
	public List<Client> findClientParByMultiParam(Client c);
	
	/**
	 * 
	 * @param c
	 * @return liste des clients organisations
	 */
	public List<Client> findClientOrgByMultiParam(Client c);
	
	/**
	 * 
	 * @param nomOrg
	 * @return
	 */
	public List<Client> findByNomOrgLikeAndAdresseVilleLike(String nomOrg, String ville);
	
	/**
	 * 
	 * @param nomOrg
	 * @param nomRep
	 * @param prenomRep
	 * @return
	 */
	public List<Client> clientExisteDeja(String nomOrg, String nomRep, String prenomRep);
	
	public List<Client> tousLesClient();

}
