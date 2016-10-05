/**
 * 
 */
package com.kyc.incentives;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.kyc.incentives.enums.ApprovalChainStatus;

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
@Table(name = "APPROVAL_CHAIN")
public class ApprovalChain extends BaseModel {

	private static final long serialVersionUID = -2521620458032167429L;
	
    @Column(name = "NO_OF_LEVELS", nullable = true)
	private int noOfLevels;
    
    @Column(name = "CURRENT_LEVEL", nullable = true)
	private int currentLevel;
    
    @Column(name = "COMPLETED", nullable = true)
	private boolean completed;
	
    @Enumerated(EnumType.STRING)
    @Column(name = "STATUS", nullable = false)
	private ApprovalChainStatus status;
	
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TERMINATION_TIME", nullable = true)
    private Date terminationTime;
}
