package com.rtmhome;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



/**
 * @author jied
 *
 *	class that represents the staff of a structure
 */

@Entity
@Table(name = "STAFF")
public class Staff {
	
	@Id
	@GeneratedValue
	@Column(name="id_staff", unique = true, nullable = false   )
	private Long idStaff;
	
	@Column(name="number_doctors")
	private int doctorNbs;
	
	@Column(name="night_doctors")
	private boolean nightDoctors;
	
	@Column(name="night_caregiver")
	private boolean nightCareGiver;
	
	@Column(name="night_kinetarpist")
	private boolean interventionKinetarpist;
	
	@Column(name="night_psyco")
	private boolean interventionPsycologist;

}
