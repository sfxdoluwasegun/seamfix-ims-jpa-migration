package com.kyc.incentives;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Agent extends BaseModel {

	private static final long serialVersionUID = -2717117024160350285L;

	@Column(name="ORBITA_ID")
	private Long kycBasicDataId;
	
	@Column(name="KYC_KMUSER_ID")
	private Long kycKmuserId;
	
	@Column(name="SRAA_DEALER")
	private SraaDealer sraaDealer;

	@Column(name="S_AND_D")
	private SandD sAndD;
	
}
