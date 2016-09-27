/**
 * 
 */
package com.kyc.incentives;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.kyc.incentives.enums.TriggerHistoryStatus;

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
@Table(name = "INCENTIVE_TRIGGER_HISTORY")
public class IncentiveTriggerHistory extends BaseModel {

	private static final long serialVersionUID = 7648789453523528880L;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="TRIGGER_AGENT_FK", nullable=false)
	private AppUser triggerAgent;
	
	@Column(name="TOTAL_AMOUNT", precision = 20, scale = 2)
	private BigDecimal totalAmount;
	
	@Column(name="STATUS")
    @Enumerated(EnumType.STRING)
	private TriggerHistoryStatus status;
	
	@Column(name = "START_DATE", nullable = true)
	@Temporal(TemporalType.DATE)
	private Date startDate;
	
	@Column(name = "END_DATE", nullable = true)
	@Temporal(TemporalType.DATE)
	private Date endDate;

	@Column(name = "ACTIVE", nullable = false)
	private boolean active;

}
