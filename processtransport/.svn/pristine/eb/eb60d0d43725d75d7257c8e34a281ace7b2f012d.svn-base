package com.idprocess.transport.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.idprocess.transport.model.Groupe;
import com.idprocess.transport.persistence.repository.GroupeRepository;
import com.idprocess.transport.services.GroupeService;

@Service

public class GroupeServiceImpl implements GroupeService{
	
	@Autowired
	private GroupeRepository groupeRepository;
	
	List <Groupe> Liste;
	
	public String addGroupe(Groupe groupe) {
		groupeRepository.save(groupe);
		return "success";
	}
	
	public void updateGroupe(Groupe groupe) {
		// TODO Auto-generated method stub
		
	}

	public void deleteGroupe(Groupe groupe) {
		// TODO Auto-generated method stub
		
	}

	public List<Groupe> tousLesGroupe(){
		Liste = groupeRepository.findAll();
		return Liste;
	}
	
	public List<Groupe> recherchAvecNomClientOuNomPassager(String nomP,String nomCli){
		return groupeRepository.recherchAvecNomClientOuNomPassager(nomP, nomCli);
	}

	
	
	
	
	
}
