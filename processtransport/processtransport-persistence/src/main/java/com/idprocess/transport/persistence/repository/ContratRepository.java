package com.idprocess.transport.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.idprocess.transport.model.Contrat;
import com.idprocess.transport.model.Groupe;

public interface ContratRepository  extends JpaRepository<Contrat, Long>, JpaSpecificationExecutor<Contrat> {
	
	public List<Contrat> findByTypeContratLikeAndPassagerNomLikeAndPassagerClientNomOrgLike(String type,String nomP, String nomC);
	
//	select * from contrat c
//	left join detail_contrat det on det.id_contrat = c.id_contrat
//	where c.id_contrat = 454
//	limit 1
	
//	@Query ("Select distinct g FROM Groupe g, Passager p, Client c " +
//			" WHERE g.idGroupe = p.groupe.idGroupe and LOWER(p.nom) LIKE LOWER(CONCAT('%', :nomPass, '%'))" +
//			" and g.client.id = c.id and LOWER(c.nomOrg) LIKE LOWER(CONCAT('%', :nomClient, '%')) ")
//	public List<Groupe> recherchContratAvecNomClientOuNomPassagerouTypeContrat(@Param("nomPass") String nomPass, @Param("nomClient") String nomClient);
}
