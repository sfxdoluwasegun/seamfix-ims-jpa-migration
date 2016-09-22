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
@Table(name = "INCENTIVE_USER_TRIGGER_HISTORY")
public class IncentiveUserTriggerHistory extends BaseModel {

	private static final long serialVersionUID = 3742290382875619735L;

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="APP_USER_FK", nullable=false)
	private AppUser user;

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="APP_USER_ROLE_FK", nullable=false)
	private Incentive incentive;

	@Column(name="AMOUNT", precision = 20, scale = 2)
	private BigDecimal amount;

	@Column(name = "UNIT_AMOUNT", precision = 8, scale = 2, nullable = true)
	private double unitAmount;

	@Column(name="UNIT_COUNT")
	private long unitCount;

	@Column(name = "START_DATE", nullable = true)
	@Temporal(TemporalType.DATE)
	private Date startDate;

	@Column(name = "START_DATE", nullable = true)
	@Temporal(TemporalType.DATE)
	private Date endDate;

	@Column(name = "ACTIVE", nullable = true)
	private boolean active;

	@Column(name = "TRIGGER_START_TIMESTAMP", nullable = true)
	@Temporal(TemporalType.TIMESTAMP)
	private Date triggerStartTime;

	@Column(name = "TRIGGER_END_TIMESTAMP", nullable = true)
	@Temporal(TemporalType.TIMESTAMP)
	private Date triggerEndTime;

	@Column(name="STATUS")
	@Enumerated(EnumType.STRING)
	private TriggerHistoryStatus status;

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="APP_USER_ROLE_FK", nullable=false)
	private IncentiveTriggerHistory incentiveTriggerHistory;
}
