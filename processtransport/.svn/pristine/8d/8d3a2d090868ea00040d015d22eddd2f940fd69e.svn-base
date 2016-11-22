package com.idprocess.transport.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="client")
@Data 
public class Client  {

	@Id
	@GeneratedValue
	@Column(name="ID", unique = true, nullable = true   )
	private Long id;
	
	@Column(name="typeClient", nullable = true)
	private String typeClient;
	
	@Column(name="nomOrg", nullable = true)
	private String nomOrg;
	
	@Column(name="departement")
	private String departement;
	
	@Column(name="service")
	private String service;
	
	@Column(name="civilite", nullable = true)
	private String civilite;
	
	@Column(name="nom", nullable = true)
	private String nom;
	
	@Column(name="prenom", nullable = true)
	private String prenom;
	
	@Column(name="nomRep", nullable = true)
	private String nomRep;
	
	@Column(name="prenomRep", nullable = true)
	private String prenomRep;
	
	@Column(name="mobile",nullable = true)
	private String mobile;
	
	@Column
	private String telfix;
	
	@Column
	private String mail; 

	@Column
	private String commentaire;
		
	@ManyToOne(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "id_adresse", nullable = true)
	private Adresse adresse = new Adresse();
}
