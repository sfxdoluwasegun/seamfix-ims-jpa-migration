/**
 * 
 */
package com.kyc.incentives;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * @author dawuzi
 *
 */

@Entity
@Getter
@Setter
@Table(name = "APP_USER_ROLE")
public class ImsRole extends BaseModel {

	private static final long serialVersionUID = -5956106329487018691L;
	
	@Column(name = "NAME", nullable = true, unique=true)
	private String name;
	
	@Column(name = "CODE", nullable = true)
	private String code;

}
