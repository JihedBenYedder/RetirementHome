package com.idprocess.transport.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

/**
 * 
 *
 */
@Entity
@Table(name="Mission")
@Data
public class Mission {

	@Id
	@GeneratedValue
	@Column(name="id_mission", unique = true, nullable = false)
	private int id;
	
	@Column(name="etat", nullable = false)
	private String etat;
	
	@Column(name="date_modif_etat", nullable = false)
	private Date dateModifEtat;
	
	@Column(name="motif_modif", nullable = false)
	private String motifModif;
	
	@Column(name="qui_modif_etat", nullable = false)
	private String quiModifEtat;
	
	@Column(name="est_plannifie", nullable = false)
	private boolean estPlannifie;
	
	@Column(name="commentaire", nullable = true)
	private String commentaire;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_planning_semaine", nullable = false)
	private PlanningSemaine planningSemaine = new PlanningSemaine();
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_chauffeur", nullable = false)
	private Chauffeur chauffeur = new Chauffeur();
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_vehicule", nullable = false)
	private Vehicule vehicule = new Vehicule();
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_facture", nullable = false)
	private Facture facture = new Facture();
	
}
