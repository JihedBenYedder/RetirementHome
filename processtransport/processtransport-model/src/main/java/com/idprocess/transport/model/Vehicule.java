package com.idprocess.transport.model;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

 
/**
 * 
 * @author oussama
 *
 */
@Entity
@Table(name = "vehicule")
public class Vehicule {
	
	/**
	 * 
	 */
	@Id
	@GeneratedValue
	@Column(name = "id_vehicule", unique = true, nullable = true)
	private int idVehicule;
	
	/**
	 * 
	 */
	@Column
	private String immatriculation;
	/**
	 * 
	 */
	@Column
	private String constructeur;
	/**
	 * 
	 */
	@Column
	private String modele;
	/**
	 * 
	 */
	@Column
	private String categorieCarrosserie;
	/**
	 * 
	 */
	@Column
	private String carburant;
	/**
	 * 
	 */
	@Column
	private String boite;
	/**
	 * 
	 */
	@Column
	private String couleurExterieure;
	/**
	 * 
	 */
	@Column
	private String interieur;
	/**
	 * 
	 */
	@Column
	private Date dateAchat;
	/**
	 * 
	 */
	@Column
	private Date miseEnCirculation;
	/**
	 * 
	 */
	@Column
	private Integer nombrePlaces;
	/**
	 * 
	 */
	@Column
	private Integer nombrePortes;
	/**
	 * 
	 */
	@Column
	private Integer kilometrage;
	/**
	 * 
	 */
	@Column
	private Boolean handicap;
	/**
	 * 
	 */
	@Column
	private String etatVehicule;
	/**
	 * 
	 */
	@Column
	private String typePropriete;
	
	
}