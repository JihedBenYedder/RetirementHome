package com.idprocess.transport.model;

import java.util.HashSet;
import java.util.Set;

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
/**
 * 
 *
 */
@Entity
@Table(name="groupe")
@Data 


public class Groupe {
	
	@Id
	@GeneratedValue
	@Column(name="IdGroupe", unique = true, nullable = false)
	private int idGroupe;
	
	@Column(name="nomGroup", nullable = false   )
	private String nomGroup;

	@Column(name="Tarif", nullable = false )
	private float tarif;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_client", nullable = false)
	private Client client = new Client();
	

}
