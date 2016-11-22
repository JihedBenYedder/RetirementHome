package com.rtmhome;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @author jied
 *
 *	class that represents the address, it will be used by the person and the structure
 */

@Entity
@Table("ADDRESS")
public class Address {

	
	@Id
	@GeneratedValue
	@Column(name="id_address", unique = true, nullable = false   )
	private Long idStaff;
	
	
	@Column(name="zipcode")
	private String zipcode;
	
	@Column(name="town")
	private String town;
	
	@Column(name="road")
	private String road;
	
	@Column(name="precision")
	private String precision;

	
	
}
