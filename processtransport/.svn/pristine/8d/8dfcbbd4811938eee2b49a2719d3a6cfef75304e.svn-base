package com.idprocess.transport.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.idprocess.transport.model.Client;
import com.idprocess.transport.model.Passager;
  
public interface PassagerRepository  extends JpaRepository  <Passager, Long> {       
	
	/**
	 * 
	 * @param nom
	 * @param prenom
	 * @return
	 */
	public List<Passager>findByNomLikeAndPrenomLikeAndAdresseVilleLikeAndClientNomOrgLike(String nom,String prenom, String ville, String nomorg);
	
	public List<Passager> findByNomLikeAndClientNomOrgLike(String nom, String nomOrg);
	
	
	@Query ("select nom FROM Passager p " +
			" WHERE LOWER(p.nom) LIKE (LOWER(CONCAT('%', :nom, '%')))" +
			"and LOWER(p.prenom) LIKE (LOWER(CONCAT('%', :prenom, '%')))" +
			"and LOWER(p.mail) LIKE (LOWER(CONCAT('%', :mail, '%')))")
	public List<Passager> passagerExisteDeja(@Param("nom") String nom, @Param("prenom") String prenom, @Param("mail") String mail);

	

}
