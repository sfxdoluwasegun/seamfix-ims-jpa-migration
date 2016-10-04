/**
 * 
 */
package com.kyc.incentives;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.kyc.incentives.enums.TargetScheduledPeriod;

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
@Table(name = "SCHEDULED_JOB")
public class ScheduledJob extends BaseModel {

	private static final long serialVersionUID = -327687311263501944L;
	
	@Column(name="name", nullable=false, unique=true)
	private String name;
	
	@Column(name="DAY_OF_MONTH", nullable=false)
	private int dayOfMonth;
	
	@Column(name = "TRIGGER_TIME", nullable = true)
	@Temporal(TemporalType.TIME)
	private Date triggerTime;
	
	@Column(name="TRIGGER_ALL_INCENTIVES", nullable=false)
	private boolean triggerAllIncentives;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH} )
	@JoinTable(name = "INCENTIVE_SCHEDULED_JOBS_MAPPER", 
		joinColumns = {@JoinColumn(name = "JOB_ID", referencedColumnName = "ID", nullable = false)},
	inverseJoinColumns = {@JoinColumn(name = "INCENTIVE_ID", referencedColumnName = "ID", nullable = false)})
	private Set<Incentive> targetIncentives;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="APP_USER_FK", nullable=false)
	private AppUser user;
	
	@Column(name="TARGET_PERIOD")
    @Enumerated(EnumType.STRING)
	private TargetScheduledPeriod targetPeriod; 

}
