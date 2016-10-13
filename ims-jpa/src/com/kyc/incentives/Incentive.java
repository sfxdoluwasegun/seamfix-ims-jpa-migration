package com.kyc.incentives;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.kyc.incentives.enums.Duration;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Entity implementation class for Entity: Incentive
 *
 */
@Entity
@Getter
@Setter
@ToString
@Table(name = "INCENTIVE")
public class Incentive extends BaseModel {
	
	private static final long serialVersionUID = -8656313905250314007L;
	
	@Column(name="NAME", nullable=false, unique=true)
	private String name;
	
	@Column(name="AMOUNT", nullable=false)
	private double amount;
	
	@Column(name="FREQUENCY_TYPE")
    @Enumerated(EnumType.STRING)
	private Duration frequencyType; 
	
	@Column(name="FREQUENCY")
	private int frequency; 

	@Column(name="INCENTIVE_CLASS", nullable = false)
	private String incentiveClass;
	
	@Column(name="DEDUCTION")
	private boolean deduction;
	
	@Column(name="OPPORTUNITY_LOSS")
	private boolean opportunityLoss;
	
	@Column(name = "ACTIVE", nullable = false)
	private boolean active = true;

	@ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH} )
	@JoinTable(name = "INCENTIVE_ROLE_MAPPER", 
		joinColumns = {@JoinColumn(name = "INCENTIVE_ID", referencedColumnName = "ID", nullable = false)},
	inverseJoinColumns = {@JoinColumn(name = "ROLE_ID", referencedColumnName = "ID", nullable = false)})
	private Set<ImsRole> targetRoles;
	
	public boolean hasRole(ImsRole role) {
		if(targetRoles == null || targetRoles.isEmpty()){
			return false;
		}
		return targetRoles.contains(role);
	}
	
}
