package com.rtmhome.persistance.repository;

import org.springframework.data.repository.CrudRepository;

import com.rtmhome.model.RetirementHome;
import com.rtmhome.model.User;

public interface UtilisateurRepo extends CrudRepository<User, Long>{

	public User findByIdUser(Long idUser);
	
	public User findByUsername(String username);
	
	
}
