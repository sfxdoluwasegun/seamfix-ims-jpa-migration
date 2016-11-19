/**
 * 
 */
package com.kyc.incentives.airtel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.kyc.incentives.BaseModel;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author dawuzi
 *
 */

@Entity
@Getter
@Setter
@ToString
@Table(name = "AIRTEL_INCENTIVE_PAYMENT")
public class AirtelIncentivePayment extends BaseModel {

	private static final long serialVersionUID = 2161901246589069216L;
	
	@Column(name="DEALER")
	private String dealer;
	
	@Column(name="FSA")
	private String fsa;
	
	@Column(name="CLIENT_ID")
	private String client_id;
	
	@Column(name="DM")
	private String dm;
	
	@Column(name="VENDOR_TYPE")
	private String vendorType;
	
	@Column(name="OWNERSHIP")
	private String ownership;
	
	@Column(name="DEAL_CODE")
	private String dealCode;
	
	@Column(name="BAND_100")
	private long band100;
	
	@Column(name="BAND_200")
	private long band200;
	
	@Column(name="BAND_500")
	private long band500;
	
	@Column(name="BAND_1000")
	private long band1000;
	
	@Column(name="POSTPAID_LINES")
	private long postpaidLines;
	
	@Column(name="ZONE")
	private String zone;
	
	@Column(name="STATE")
	private String state;
	
	@Column(name="MONTH")
	private String month;
	
	@Column(name="TOTAL_RECHARGELESS_REREGISTERED ")
	private String totalRechargelessReregistered;
	
	@Column(name="VARIANCE")
	private String variance;
	
	@Column(name="FINAL_PAYOUT")
	private String finalPayout;
	
	@Column(name="SSCA_DEAL_CODE")
	private String sscaDealCode;
	
	@Column(name="SSCA_BANK")
	private String sscaBank;
	
	@Column(name="DEAL_CODE_CP")
	private String dealCodeCp;
	
	@Column(name="ERC_KITS_FOR_DEDUCTION")
	private String ercKitsForDeduction;
	
	@Column(name="BANK_KITS_FOR_DEDUCTION")
	private String bankKitsForDeduction;
	
	@Column(name="ALL_OTHER_KITS")
	private String allOtherKits;
	
	@Column(name="TOTAL_PAYOUT")
	private String totalPayout;
	
}
