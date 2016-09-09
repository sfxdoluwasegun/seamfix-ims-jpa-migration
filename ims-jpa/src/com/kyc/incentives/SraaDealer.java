package com.kyc.incentives;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;

import lombok.Getter;
import lombok.Setter;

/**
 *
 */
@Entity
@Getter
@Setter
public class SraaDealer extends BaseModel {
	
	private static final long serialVersionUID = 9161064150992862245L;

	@Column(name="KYC_DEALER_ID")
	private Long kycDealerId;
	
	@Column(name="ORBITA_ID")
	private Long orbitaId;
	
	@Column(name="NAME")
	private String name;
	
	@JoinColumn(name="S_D")
	private SandD sAndD;
}
