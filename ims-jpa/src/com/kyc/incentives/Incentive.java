package com.kyc.incentives;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.kyc.incentives.enums.Duration;

import lombok.Getter;
import lombok.Setter;

/**
 * Entity implementation class for Entity: Incentive
 *
 */
@Entity
@Getter
@Setter
public class Incentive extends BaseModel {
	
	private static final long serialVersionUID = -8656313905250314007L;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="AMOUNT")
	private double amount;
	
	@Column(name="FREQUENCY")
	private Duration frequency; 

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="ACTIVITY_FK", nullable=false)
	private Activity activity;
   
}
