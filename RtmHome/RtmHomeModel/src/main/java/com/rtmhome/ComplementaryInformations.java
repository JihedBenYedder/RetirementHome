package com.rtmhome;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @author jied
 *
 *	class that contains other specified informations about a retirement home
 */

@Entity
@Table("COMPEMENTARY_INFORMATIONS")
public class ComplementaryInformations {

	@Id
	@GeneratedValue
	@Column(name="id_complementary_informations", unique = true, nullable = false   )
	private Long idComplementaryInformations;
	
	
	/*
	 *	Accommodation
	 */
	@Column(name="total_bed_nbr")
	private int totalBedNbr;
	
	@Column(name="simple_room_nbr")
	private int simpleRoomNbr;
	
	@Column(name="simple_room_surface")
	private Long simpleRoomSurface;
	
	/*
	 *	Life In RetirementHome
	 */
	
	@Column(name="resto_ctrled_by_structure")
	private boolean isRestauCtrlByStrct;
	
	@Column(name="resto_subcontracting")
	private boolean isRestoSubcontract;
	
	@Column(name="family_access_resto")
	private boolean familyCanAccessResto;
	
	/*
	 *	General Informations
	 */
	@Column(name="car_park")
	private boolean hasCarPark;
	
	
	@Column(name="multimedia_equipement")
	private boolean hasMultimediaEquipement;
	
	
	

}
