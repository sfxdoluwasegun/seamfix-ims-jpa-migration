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
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
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
@NamedNativeQueries(value = { 
		@NamedNativeQuery(name = "findByOrbitaId", query = "from AppUser a where a.orbitaId = :orbitaId"),
		
})
public class AppUser extends BaseModel {
	
	private static final long serialVersionUID = -6897079440518802680L;

    @Column(name = "ORBITA_ID", nullable=false, unique=true)
	private long orbitaId;

	@Column(name = "EMAIL", nullable = false)
    private String email;

	@Column(name = "NAME")
    private String name;
	
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
