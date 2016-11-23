package com.rtmhome;

import java.sql.Date;

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
@Table(name = "PERSON")
public class Person {

	@Id
	@GeneratedValue
	@Column(name = "id_person", unique = true, nullable = true)
	private Long idPerson;

	@Column(name = "name", nullable = true)
	private String name;

	@Column(name = "firstName", nullable = true)
	private String firstName;

	@Column(name = "civility", nullable = true)
	private String civility;

	@Column(name = "birthDate", nullable = true)
	private Date birthDate;

	@Column(name = "birthPlace", nullable = true)
	private String birthPlace;

	@Column(name = "address", nullable = true)
	private String address;

	@Column(name = "email", nullable = true)
	private String email;

	@Column(name = "phoneNumber", nullable = true)
	private String phoneNumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getCivility() {
		return civility;
	}

	public void setCivility(String civility) {
		this.civility = civility;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Long getIdPerson() {
		return idPerson;
	}

	public void setIdPerson(Long idPerson) {
		this.idPerson = idPerson;
	}

}
