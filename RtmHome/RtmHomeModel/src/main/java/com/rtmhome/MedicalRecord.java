package com.rtmhome;

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
@Table(name = "MEDICAL_RECORD")
public class MedicalRecord {

	@Id
	@GeneratedValue
	@Column(name = "ID_MEDICAL_RECORD", unique = true, nullable = true)
	private Long idMedicalRecord;

	@Column(name = "SOCIAL_NUMBER", nullable = true)
	private Integer socialNumber;

	@Column(name = "MEDECIN_TRAITANT", nullable = true)
	private String medecinTraitant;

	@Column(name = "TREATEMENT_IN_PROGRESS", nullable = true)
	private String treatementInProgress;

	@Column(name = "SIZE", nullable = true)
	private Long size;

	@Column(name = "WEIGHT", nullable = true)
	private Long weight;

}
