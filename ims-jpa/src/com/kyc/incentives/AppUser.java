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
import javax.persistence.ManyToOne;
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
@Table(name = "APP_USER")
public class AppUser extends BaseModel {
	
	private static final long serialVersionUID = -6897079440518802680L;

    @Column(name = "ORBITA_ID", nullable=false, unique=true)
	private long orbitaId;

	@Column(name = "EMAIL", nullable = false)
    private String email;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "APP_USER_ROLE_MAPPER", 
		joinColumns = {@JoinColumn(name = "APP_USER_ID", referencedColumnName = "ID", nullable = false)},
	inverseJoinColumns = {@JoinColumn(name = "ROLE_ID", referencedColumnName = "ID", nullable = false)})
	private Set<ImsRole> roles;
	
	public boolean hasRole(ImsRole role) {
		if(roles == null || roles.isEmpty()){
			return false;
		}
		return roles.contains(role);
	}
}
