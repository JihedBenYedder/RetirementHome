package com.rtmhome.persistance.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rtmhome.model.User;

@Repository
public interface UtilisateurRepo extends CrudRepository<User, Long>{

	public User findByIdUser(Long idUser);
	
	public User findByUsername(String username);
	
	
}
