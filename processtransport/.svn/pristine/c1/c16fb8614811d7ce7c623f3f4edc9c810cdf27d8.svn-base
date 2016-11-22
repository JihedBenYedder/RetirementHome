package com.idprocess.transport.model;

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
@Table(name="Chauffeur")
@Data
public class Chauffeur {
	
	@Id
	@GeneratedValue
	@Column(name="id_chauffeur", unique = true, nullable = false)
	private int idChauffeur;
	
	@Column(name="nom", nullable = false)
	private String nom;
	
	@Column(name="prenom", nullable = false)
	private String prenom;
	
	@Column(name="datenaissance", nullable = false)
	private String datenaissance;
		
	@Column(name="mobile", nullable = false)
	private String mobile;
	
	@Column(name="telfix", nullable = false)
	private String telfix;
	
	@Column(name="login", unique = true, nullable = false)
	private String login;
	
	@Column(name="password", nullable = false)
	private String password;
	
	@Column(name="email", unique = true, nullable = false)
	private String email;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_adresse", nullable = false)
	private Adresse adresse = new Adresse();
	
	
	
}
