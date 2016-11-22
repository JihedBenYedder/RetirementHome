package com.idprocess.transport.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name="adresse")
@Data
public class Adresse {
	
	
	@Id
	@GeneratedValue
	@Column(name="id_adresse", unique = true, nullable = false   )
	private Long idAdresse;
	
	@Column(name="ville")
	private String ville;
	
	@Column(name="rue")
	private String rue;
	
	@Column(name="precision")
	private String precision;
	
	@Column(name="cp")
	private String cp;

}
