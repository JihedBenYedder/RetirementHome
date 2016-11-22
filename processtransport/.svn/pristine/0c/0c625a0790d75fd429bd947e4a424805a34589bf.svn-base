package com.idprocess.transport.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.idprocess.transport.model.Client;

/**
 * 
 * @author oussama
 *
 */
public interface ClientRepository extends JpaRepository<Client, Long>{

	public List<Client> findByNomOrgLikeAndAdresseVilleLike(String nomOrg, String ville);
	
	public List<Client> findClientByNomOrgLike(String nomOrg);	
	
	/**
	 * 
	 * @param nomOrg
	 * @param nomRep
	 * @param prenomRep
	 * @return
	 */
	@Query ("select nomOrg FROM Client c " +
			" WHERE LOWER(c.nomOrg) LIKE (LOWER(CONCAT('%', :nomOrg, '%')))" +
			"and LOWER(c.nomRep) LIKE (LOWER(CONCAT('%', :nomRep, '%')))" +
			"and LOWER(c.prenomRep) LIKE (LOWER(CONCAT('%', :prenomRep, '%')))")
	public List<Client> clientExisteDeja(@Param("nomOrg") String nomOrg, @Param("nomRep") String nomRep, @Param("prenomRep") String prenomRep);



}
