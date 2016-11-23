package com.rtmhome;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author jied
 *
 *	class that represents a retirement home
 */

@Entity
@Table("RETIREMENT_HOME")
public class RetirementHome extends Structure {

	@Id
	@GeneratedValue
	@Column(name="id_retirement_home", unique = true, nullable = false   )
	private Long idRetirementHome;
	
	@Column(name="name")
	private boolean name;
	
	@Column(name="daily_rate")
	private boolean dailyRate;
	
	@Column(name="alzhaimer_unit")
	private boolean AlzhaimerUnit;
	
	@Column(name="disabled_unit")
	private boolean disabledUnit;
	
	@Column(name="apl_assistance")
	private boolean apl_assistance;
	
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_complementary_informations" , nullable = true)
	private ComplementaryInformations complementaryInformations = new ComplementaryInformations();
	
	
	
}
