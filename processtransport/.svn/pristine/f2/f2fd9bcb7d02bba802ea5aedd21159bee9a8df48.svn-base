package com.idprocess.transport.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idprocess.transport.model.Client;
import com.idprocess.transport.model.Contrat;
import com.idprocess.transport.persistence.repository.ContratRepository;
import com.idprocess.transport.services.ContratService;

@Service
public class ContratServiceImpl implements ContratService {
	
	@Autowired
	ContratRepository contratRepository;
	
	
	/*
	 * (non-Javadoc)
	 * @see com.idprocess.transport.services.ContratService#addContrat(com.idprocess.transport.model.Contrat)
	 */
	public void addContrat(Contrat contrat) {
		contratRepository.save(contrat);
	}
	/*
	 * (non-Javadoc)
	 * @see com.idprocess.transport.services.ContratService#updateContrat(com.idprocess.transport.model.Contrat)
	 */
	public void updateContrat(Contrat contrat) {
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.idprocess.transport.services.ContratService#deleteContrat(com.idprocess.transport.model.Contrat)
	 */
		public void deleteContrat(Contrat contrat) {
		// TODO Auto-generated method stub
		
	}
		
//		public List<Contrat> findByNomOrgLikeAndAdresseVilleLike(String nomOrg,String ville) {
//			return contratRepository.findByNomOrgLikeAndAdresseVilleLike(nomOrg,	ville);
//		}
		
		
		/*
		 * (non-Javadoc)
		 * @see com.idprocess.transport.services.ContratService#findByTypeContratLikeAndPassagerNomLike(java.lang.String, java.lang.String)
		 */
		public List<Contrat> findByTypeContratLikeAndPassagerNomLike(String type,String nomP, String nomC) {
			return contratRepository.findByTypeContratLikeAndPassagerNomLikeAndPassagerClientNomOrgLike(type,	nomP,  nomC);
		}

}
