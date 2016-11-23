package com.rtmhome;

import java.sql.Date;

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
 * @author Zhlel
 *
 */
@Entity
@Table(name = "RETRAITE")
public class Retraite extends Person {

	@Id
	@GeneratedValue
	@Column(name = "ID_RETRAITE", unique = true, nullable = true)
	private Long idRetraite;

	@Column(name = "REGISTRATION_NUMBER", nullable = true)
	private Integer registrationNumber;

	// mesure de protection juridique
	@Column(name = "LEGAL_PROTECTION_MEASURE", nullable = true)
	private String legalProtectionMeasure;

	@Column(name = "CHILDREN_NUMBER", nullable = true)
	private Integer childrenNumber;

	@Column(name = "ACCOMMODATION_TYPE", nullable = true)
	private String accommodationType;

	@Column(name = "COUPLE_INHOME", nullable = true)
	private boolean coupleInHome;

	@Column(name = "SITUATION", nullable = true)
	private String situation;

	@Column(name = "ENTRY_DATE", nullable = true)
	private Date entryDate;

	@Column(name = "TEMPORARY_ENTRY_DATE", nullable = true)
	private Date temporaryEntryDate;

	@Column(name = "DATE_OF_APPLICATION", nullable = true)
	private Date dateOfApplication;

	@Column(name = "STAY_DURATION", nullable = true)
	private String stayDuration;

	// Aspects financiers
	@Column(name = "FINANCIAL_MANNERS", nullable = true)
	private String financialManners;

	@Column(name = "SOCIAL_SECURITY", nullable = true)
	private String socialSecurity;

	@Column(name = "ALLOCATION_APL", nullable = true)
	private String allocationApl;

	@Column(name = "ALLOCATION_AUTONOMY", nullable = true)
	private String allocationAutonomy;

	@Column(name = "DISABILITY_BENEFIT", nullable = true)
	private boolean disabilityBenefit;

	public Date getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public Date getTemporaryEntryDate() {
		return temporaryEntryDate;
	}

	public void setTemporaryEntryDate(Date temporaryEntryDate) {
		this.temporaryEntryDate = temporaryEntryDate;
	}

	public Date getDateOfApplication() {
		return dateOfApplication;
	}

	public void setDateOfApplication(Date dateOfApplication) {
		this.dateOfApplication = dateOfApplication;
	}

	public String getAccommodationType() {
		return accommodationType;
	}

	public void setAccommodationType(String accommodationType) {
		this.accommodationType = accommodationType;
	}

	public boolean isCoupleInHome() {
		return coupleInHome;
	}

	public void setCoupleInHome(boolean coupleInHome) {
		this.coupleInHome = coupleInHome;
	}

	public String getSituation() {
		return situation;
	}

	public void setSituation(String situation) {
		this.situation = situation;
	}

	public String getStayDuration() {
		return stayDuration;
	}

	public void setStayDuration(String stayDuration) {
		this.stayDuration = stayDuration;
	}

	public String getFinancialManners() {
		return financialManners;
	}

	public void setFinancialManners(String financialManners) {
		this.financialManners = financialManners;
	}

	public String getSocialSecurity() {
		return socialSecurity;
	}

	public void setSocialSecurity(String socialSecurity) {
		this.socialSecurity = socialSecurity;
	}

	public String getAllocationApl() {
		return allocationApl;
	}

	public void setAllocationApl(String allocationApl) {
		this.allocationApl = allocationApl;
	}

	public String getAllocationAutonomy() {
		return allocationAutonomy;
	}

	public void setAllocationAutonomy(String allocationAutonomy) {
		this.allocationAutonomy = allocationAutonomy;
	}

	public boolean isDisabilityBenefit() {
		return disabilityBenefit;
	}

	public void setDisabilityBenefit(boolean disabilityBenefit) {
		this.disabilityBenefit = disabilityBenefit;
	}

	public Integer getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(Integer registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getLegalProtectionMeasure() {
		return legalProtectionMeasure;
	}

	public void setLegalProtectionMeasure(String legalProtectionMeasure) {
		this.legalProtectionMeasure = legalProtectionMeasure;
	}

	public Integer getChildrenNumber() {
		return childrenNumber;
	}

	public void setChildrenNumber(Integer childrenNumber) {
		this.childrenNumber = childrenNumber;
	}

	public Long getIdRetraite() {
		return idRetraite;
	}

	public void setIdRetraite(Long idRetraite) {
		this.idRetraite = idRetraite;
	}

	public MedicalRecord getMedicalRecord() {
		return medicalRecord;
	}

	public void setMedicalRecord(MedicalRecord medicalRecord) {
		this.medicalRecord = medicalRecord;
	}

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_MEDICAL_RECORD", nullable = true)
	private MedicalRecord medicalRecord = new MedicalRecord();

	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_TRUSTED_PERSON", nullable = true)
	private Guarantor trustedPerson = new Guarantor();

}
