package com.idprocess.transport.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name="planning_semaine")
@Data
public class PlanningSemaine {
	
	
	@Id
	@GeneratedValue
	@Column(name="id_planning_semaine", unique = true, nullable = false   )
	private int idPlanningSemaine;
	
	/*@Column(name="jour")
	private String jour;
	
	
	@Column(name="heure_aller")
	private Date heureAller;
	
	@Column(name="heure_retour")
	private Date heureRetour; */
	
	@Column(name="lun_A", nullable = true)
	private Date lunA;
	
	@Column(name="lun_R", nullable = true)
	private Date lunR;
	
	@Column(name="mar_A", nullable = true)
	private Date marA;
	
	@Column(name="mar_R", nullable = true)
	private Date marR;
	
	@Column(name="mer_A", nullable = true)
	private Date merA;
	
	@Column(name="mer_R", nullable = true)
	private Date merR;
	
	@Column(name="jeu_A", nullable = true)
	private Date jeuA;
	
	@Column(name="jeu_R", nullable = true)
	private Date jeuR;
	
	@Column(name="ven_A", nullable = true)
	private Date venA;
	
	@Column(name="ven_R", nullable = true)
	private Date venR;
	
	@Column(name="sam_A", nullable = true)
	private Date samA;
	
	@Column(name="sam_R", nullable = true)
	private Date samR;
	
	@Column(name="dim_A", nullable = true)
	private Date dimA;
	
	@Column(name="dim_R", nullable = true)
	private Date dimR;
	
	@ManyToOne
	@JoinColumn(name = "id_detail_contrat" )
	private DetailContrat detailContrat ;
	
	
}
