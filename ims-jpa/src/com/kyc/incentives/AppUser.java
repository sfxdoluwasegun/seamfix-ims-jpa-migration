/**
 * 
 */
package com.kyc.incentives;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
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
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="APP_USER_ROLE_FK", nullable=false)
	private ImsRole role;
	
}
