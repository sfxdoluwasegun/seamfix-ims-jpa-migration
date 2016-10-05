/**
 * 
 */
package com.kyc.incentives;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

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
@Table(name = "APPROVAL_CHAIN_LEVEL")
public class ApprovalChainLevel extends BaseModel {

	private static final long serialVersionUID = -1851588665795951899L;

	@Column(name = "LEVEL", nullable = true)
	private int level;

	@Column(name = "MINIMUM_APPROVAL_COUNT", nullable = true)
	private int minimumApprovalCount;

	@Column(name = "CURRENT_APPROVAL_COUNT", nullable = true)
	private int currentApprovalCount;

    @Column(name = "COMPLETED", nullable = true)
	private boolean completed;
    
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "APPROVAL_CHAIN_LEVEL_ROLE_MAPPER", 
		joinColumns = {@JoinColumn(name = "APPROVAL_CHAIN_LEVEL_ID", referencedColumnName = "ID", nullable = false)},
	inverseJoinColumns = {@JoinColumn(name = "ROLE_ID", referencedColumnName = "ID", nullable = false)})
	private Set<ImsRole> authorizedRoles;

	@Column(name = "APPROVAL_CHAIN_FK", nullable = true)
	private ApprovalChain approvalChain;

}
