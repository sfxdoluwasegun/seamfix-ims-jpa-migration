package com.kyc.incentives;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

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
	
	@Column(name="VALIDATOR_ORBITA_ID")
	private Long validatorOrbitaId;
	
	@Column(name="VALIDATOR_NAME")
	private String validatorName;
	
	@Column(name="SRAA_DEALER_ID")
	private Long sraaDealerId;
	
	@Column(name="SRAA_DEALER_NAME")
	private String sraaDealerName;
	
	@Column(name="COMMENT")
	private String comment;
	
	@OneToMany(cascade={CascadeType.ALL}, fetch=FetchType.LAZY, mappedBy = "validationRecord")
	private List<Dispute> disputes;	
	
	public void addDispute(Dispute dispute){
		List<Dispute> disputes = getDisputes();
		
		if(disputes == null)
			disputes = new ArrayList<Dispute>();
		
		disputes.add(dispute);
		
		setDisputes(disputes);
	}
}
