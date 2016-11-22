package com.idprocess.transport.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idprocess.transport.model.Client;
import com.idprocess.transport.persistence.repository.ClientRepository;
import org.springframework.data.domain.Sort;
import com.idprocess.transport.services.ClientService;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientRepository clientRepository;

	public String addClient(Client client) {
				
		// verification de l'existance de client dans la base
		List<Client> listC = clientExisteDeja(client.getNomOrg(), client.getNomRep(), client.getPrenomRep());
		//System.out.println("size ===" + listC2.size());
		if(listC.size() == 0){
			clientRepository.save(client);
		}
		else {
			System.out.println("Ce client existe deja !!");
		}
		return "success";
	}

	public List<Client> tousLesClient() {
		return clientRepository.findAll();
	}

	public void updateClient(Client client) {
		// TODO Auto-generated method stub

	}

	public void deleteClient(Client client) {
		// TODO Auto-generated method stub

	}

	public List<Client> getClient() {
		// return clientDao.getClient();
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.idprocess.transport.services.ClientService#findClientByMultiParam
	 * (com.idprocess.transport.model.Client)
	 */
	public List<Client> findClientByMultiParam(Client client) {
		return clientRepository.findAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.idprocess.transport.services.ClientService#findClientParByMultiParam
	 * (com.idprocess.transport.model.Client)
	 */
	public List<Client> findClientParByMultiParam(Client c) {
		return clientRepository.findAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.idprocess.transport.services.ClientService#findClientOrgByMultiParam
	 * (com.idprocess.transport.model.Client)
	 */
	public List<Client> findClientOrgByMultiParam(Client client) {
		return clientRepository.findAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.idprocess.transport.services.ClientService#findByMultiParam(java.
	 * lang.String)
	 */
	public List<Client> findByNomOrgLikeAndAdresseVilleLike(String nomOrg,String ville) {
		return clientRepository.findByNomOrgLikeAndAdresseVilleLike(nomOrg,	ville);
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.idprocess.transport.services.ClientService#clientExisteDeja(java.lang.String, java.lang.String, java.lang.String)
	 */
	public List<Client> clientExisteDeja(String nomOrg, String nomRep, String prenomRep){
		return clientRepository.clientExisteDeja(nomOrg, nomRep, prenomRep);
	}

}
