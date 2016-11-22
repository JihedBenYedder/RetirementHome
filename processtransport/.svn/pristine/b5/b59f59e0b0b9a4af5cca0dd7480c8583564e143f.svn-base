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

/**
 * 
 *
 */
@Entity
@Table(name = "passager")
@Data
public class Passager {
	@Id
	@GeneratedValue
	@Column(name = "id_passager", unique = true, nullable = true)
	private Long idPassager;
	
	@Column(name = "civilite", nullable = true)
	private String civilite;
		
	
	@Column(name = "nom", nullable = true)
	private String nom;
	
	@Column(name = "prenom", nullable = true)
	private String prenom;
	
	@Column(name = "mobile",nullable = true)
	private String mobile;
	
	@Column
	private String telfix;
	
	@Column
	private String mail;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_groupe", nullable = true)
	private Groupe groupe = new Groupe();

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_client", nullable = true)
	private Client client = new Client();
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "id_adresse", nullable = true)
	private Adresse adresse = new Adresse();

}
