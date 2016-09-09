package com.kyc.incentives;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ValidationRecord extends BaseModel {

	private static final long serialVersionUID = 1504243928708007561L;
	
	@Column(name="BASIC_DATA_ID")
	private Long kycBasicDataId;
	
	@Column(name="STATUS")
	private boolean status;
	
	@Column(name="VALIDATOR")
	private Long validator;
	
	@Column(name="SRAA_DEALER")
	private Long sraaDealer;
	
	@Column(name="COMMENT")
	private String comment;
	
	@Column(name="DISPUTE")
	private String dispute;	
}
