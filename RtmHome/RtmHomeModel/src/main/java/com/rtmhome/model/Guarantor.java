package com.rtmhome.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @author Zhlel
 *
 */
@Entity
@Table(name = "TRUSTED_PERSON")
public class Guarantor extends Person {

	@Id
	@GeneratedValue
	@Column(name = "ID_TRUSTED_PERSON", unique = true, nullable = true)
	private Long idTrustedPerson;

	@Column(name = "RELATIONSHIP", nullable = true)
	private String relationShip;

}
