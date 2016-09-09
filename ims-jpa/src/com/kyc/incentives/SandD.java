package com.kyc.incentives;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

/**
 *
 */
@Entity
@Getter
@Setter
public class SandD extends BaseModel {
	
	private static final long serialVersionUID = -5713998650788969455L;

	@Column(name="KYC_SD_ID")
	private Long kycSdId;
	
	@Column(name="ORBITA_ID")
	private Long orbitaId;
	
	@Column(name="NAME")
	private String name;
	
}
