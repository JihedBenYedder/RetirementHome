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
@Table(name="lignes_facture")
@Data 
public class LignesFacture  {

	@Id
	@GeneratedValue
	@Column(name="id_ligne_facture", unique = true, nullable = false)
	private int idLigneFacture;
	
	@Column(name="total", nullable = false)
	private float total;
	
	@Column(name="id_passager", nullable = false)
	private int idPassager;
	
	@Column(name="id_groupe", nullable = false)
	private int idGroupe;	
	
	@Column(name="date", nullable = false)
	private Date date;
	
	@Column(name="heure", nullable = false)
	private String heure;
	
	@Column(name="ville_depart", nullable = false)
	private String villeDepart;	
	
	@Column(name="ville_arrivee", nullable = false)
	private String villeArrivee;	
	
	@Column(name="tarif_ht", nullable = false)
	private float tarifHT;	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_facture", nullable = false)
	private Facture facture = new Facture();
}
