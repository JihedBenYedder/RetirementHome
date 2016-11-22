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
@Table(name="detail_contrat")
@Data

public class DetailContrat {
		
	@Id
	@GeneratedValue
	@Column(name="id_detail_contrat", unique = true, nullable = false   )
	private int idDetailContrat;
	
	@Column(name="date_debut_detail",  nullable = true   )
	private Date dateDebutDetail;
	
	@Column(name="date_fin_detail",  nullable = true   )
	private Date dateFinDetail;
	
	/** cette partie concerne les contrat ocassionnels **/
	@Column(name="date_debut_ocass",  nullable = true   )
	private Date dateDebutOcass;
	
	@Column(name="date_fin_ocass",  nullable = true   )
	private Date dateFinOcass;
	
	@Column(name="heure_aller_ocass",  nullable = true   )
	private Date heureAllerOcass;
	
	@Column(name="heure_retour_ocass",  nullable = true   )
	private Date heureRetourOcass;
	
	/** fin partie contrat ocassionnels **/
	
	@Column(name="duree",  nullable = true   )
	private Integer duree;
	
	@Column(name="tarif_ttc",  nullable = true   )
    private long   tarifTtc;
	
	
	@ManyToOne
	@JoinColumn(name = "id_contrat" )
	private Contrat contrat ;
	
	
	// liaison avec la table adresse 
	@ManyToOne(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "id_adresse_depart", nullable = true)
	private Adresse adresseDepart = new Adresse();
	
	@ManyToOne(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "id_adresse_arrivee", nullable = true)
	private Adresse adresseArrivee = new Adresse();
	
	// liaison avec planning semaine
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="id_detail_contrat")
	private List<PlanningSemaine> planningSemaines = new ArrayList<PlanningSemaine>();
	
	
		
}
