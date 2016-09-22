package com.kyc.incentives;

import javax.persistence.Column;
import javax.persistence.Entity;
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
	
	@Column(name="FREQUENCY")
	private Duration frequency; 

	@Column(name="INCENTIVE_CLASS", nullable = false)
	private String incentiveClass;

}
