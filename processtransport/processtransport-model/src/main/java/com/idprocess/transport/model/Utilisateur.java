package com.idprocess.transport.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * 
 *
 */
@Entity
@Table(name="Users")
@Data
public class Utilisateur {

	@Id
	@GeneratedValue
	@Column(name="ID", unique = true, nullable = false)
	private int id;
	
	@Column(name="nom", nullable = false)
	private String nom;
	
	@Column(name="prenom", nullable = false)
	private String prenom;
	
	@Column(name="login", unique = true, nullable = false)
	private String login;
	
	@Column(name="password", nullable = false)
	private String password;
	
	@Column(name="email", unique = true, nullable = false)
	private String email;
	
	
}
