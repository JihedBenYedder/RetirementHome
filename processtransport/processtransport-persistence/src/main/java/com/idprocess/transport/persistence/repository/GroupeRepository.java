package com.idprocess.transport.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.idprocess.transport.model.Groupe;
import com.idprocess.transport.model.Passager;

/**
 * 
 * @author Anis
 *
 */
public interface GroupeRepository extends JpaRepository<Groupe, Long>{

	public List<Groupe> findByClientNomOrgLike(String nomOrg);	
	
	@Query ("Select distinct g FROM Groupe g, Passager p, Client c " +
			" WHERE g.idGroupe = p.groupe.idGroupe and LOWER(p.nom) LIKE LOWER(CONCAT('%', :nomPass, '%'))" +
			" and g.client.id = c.id and LOWER(c.nomOrg) LIKE LOWER(CONCAT('%', :nomClient, '%')) ")
	public List<Groupe> recherchAvecNomClientOuNomPassager(@Param("nomPass") String nomPass, @Param("nomClient") String nomClient);
	
//	@Query ("Select distinct g FROM Groupe g Left join Passager p Left join Client c " +
//			" WHERE g.idGroupe = p.groupe.idGroupe and LOWER(p.nom) LIKE LOWER(CONCAT('%', :nomPass, '%'))" +
//			" and g.client.id = c.id and LOWER(c.nomOrg) LIKE LOWER(CONCAT('%', :nomClient, '%')) ")
//	public List<Groupe> recherchAvecNomClientOuNomPassager(@Param("nomPass") String nomPass, @Param("nomClient") String nomClient);
	
}
