package com.rtmhome.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;




/**
 * @author jied
 *
 *	class that represents the structure in general
 */

@Entity
@Table(name = "STRUCTURE")
public class Structure {

	@Id
	@GeneratedValue
	@Column(name="id_structure", unique = true, nullable = false   )
	private Long idStaff;
	
	@Column(name="legal_status")
	private String legalStatus;
	
	@Column(name="telephone")
	private String telephone;
	
	@Column(name="website")
	private String website;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_staff", nullable = true)
	private Staff staff = new Staff();
	
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_address" , nullable = true)
	private Address address = new Address();
	
}
