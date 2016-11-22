package com.idprocess.transport.model;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "contrat")
@Data 
public class Contrat {	
	
	@Id
	@GeneratedValue
	@Column(name = "id_contrat", unique = true, nullable = false)
	private int idContrat;
	
	@Column(name = "type_contrat")
	private String typeContrat;

	@Column(name = "date_debut_contart",  nullable = true)
	private Date dateDebutContrat;
	
	@Column(name = "date_fin_contrat",  nullable = true)
	private Date dateFinContrat;
	
	@Column(name = "Vehicule_adapte",  nullable = true)
	private boolean vehiculeAdapte;
	
	@Column(name = "dans_cadre_groupe", nullable = true)
	private boolean dansCadreGroupe;
	
	@Column(name = "bagages",  nullable = true)
	private Integer bagages;
	
	@Column(name = "nombre_adultes",  nullable = true)
	private Integer nombreAdultes;

	@Column(name = "nombre_enfants",  nullable = true)
	private Integer nombreEnfants;
	
	@Column(name = "nombre_bebe",  nullable = true)
	private Integer nombreBebe;
	
	@Column(name = "payeur",  nullable = true)
    private   Integer payeur;
	
	@Column(name = "etat_contrat",  nullable = true)
	private String etatContrat;

	@Column(name = "date_debut_suspension",  nullable = true)
    private Date dateDebutSuspension;
	
	@Column(name = "date_fin_suspension",  nullable = true)
	private Date dateFinSuspension;
	
	@Column(name = "commentaire",  nullable = true)
	private String commentaire;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_passager", nullable = true)
	private Passager passager = new Passager();

	@OneToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "id_contrat")
	private List<DetailContrat> detailContrats = new ArrayList<DetailContrat>();


}
