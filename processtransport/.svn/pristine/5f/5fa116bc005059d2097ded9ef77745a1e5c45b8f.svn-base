package com.idprocess.transport.ws.services;


import java.util.List;

import javax.jws.WebService;

import com.idprocess.transport.model.Client;
import com.idprocess.transport.model.Mission;
import com.idprocess.transport.ws.exceptions.AuthorNotFoundException;

@WebService(name = "Client", serviceName = "ClientService")
public interface ClientWsService {
	

	
	
	/**
	 * Add Client
	 * 
	 * @param  Client client
	 */
	String addClient(Client client);
	
	
	/**
	 * 
	 * @param id
	 * @return
	 * @throws AuthorNotFoundException
	 */
	String getNameClient(int id) throws AuthorNotFoundException;
	
	
	/**
	 * 
	 * @param login
	 * @param mp
	 * @return if User is logged
	 */
	public boolean loginUser(String login, String mp);
	
	/**
	 * 
	 * @param login
	 * @param mp
	 * @return if chauffeur is logged 
	 */
	public boolean loginChauffeur(String login, String mp);
	
	
	/**
	 * 
	 * @param mission
	 * @return
	 */
	public List<Mission> findMissionByChauffeur(String chauffeur, String mp);
	

}
