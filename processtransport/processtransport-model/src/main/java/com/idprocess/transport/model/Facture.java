package com.idprocess.transport.model;



import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

/**
 * 
 *
 */
@Entity
@Table(name="facture")
@Data 
public class Facture  {

	@Id
	@GeneratedValue
	@Column(name="id_facture", unique = true, nullable = false)
	private int idFacture;
	
	@Column(name="total", nullable = false)
	private float total;
	
	@Column(name="id_payeur", nullable = false)
	private int idPayeur;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "facture")
	private Set<LignesFacture> lignesFacture;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "facture")
	private Set<Mission> mission;
}
