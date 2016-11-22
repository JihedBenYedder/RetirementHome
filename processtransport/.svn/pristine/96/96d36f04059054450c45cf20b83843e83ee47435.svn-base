package com.idprocess.transport.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idprocess.transport.model.Client;
import com.idprocess.transport.model.Passager;
import com.idprocess.transport.persistence.repository.PassagerRepository;
import com.idprocess.transport.services.PassagerService;

@Service
public class PassagerServiceImpl implements PassagerService{            


	@Autowired
	PassagerRepository passagerRepository;
	
	public String addPassager(Passager passager) {
		
		// verification de l'existance de passager dans la base
		List<Passager> listP = passagerExisteDeja(passager.getNom(), passager.getPrenom(), passager.getMail());
			//System.out.println("size==== "+ listP.size());	
			if(listP.size()==0){
				passagerRepository.save(passager);
			}			
			return "success";
	}
	
	public List<Passager> trouve(String nom, String nomOrg) {
		return passagerRepository.findByNomLikeAndClientNomOrgLike(nom, nomOrg);
	}
	
	
	
	public void updatePassager(Passager passager) {
		// TODO Auto-generated method stub
		
	}

	public void deletePassager(Passager passager) {
		// TODO Auto-generated method stub
		
	}

	public List<Passager> getPassager() {
		return null; //passagerDao.getPassager();

	}

	public List<Passager> findPassagerByParam(Passager p) {
		return null; //passagerDao.findPassagerByParam(p);		
	}

	public List<Passager> findPassagerByParam(String nom,String prenom, String ville, String nomorg) {
		return passagerRepository.findByNomLikeAndPrenomLikeAndAdresseVilleLikeAndClientNomOrgLike(nom,prenom, ville,nomorg);
	}

	public List<Passager> findToutPassager(){
		return passagerRepository.findAll();
	}
	
	public List<Passager> passagerExisteDeja(String nom, String prenom, String mail){
		return passagerRepository.passagerExisteDeja(nom, prenom, mail);
	}
	
}
