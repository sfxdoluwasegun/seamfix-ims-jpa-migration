/**
 * 
 */
package com.kyc.incentives;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "ACTIVITY")
public class Activity extends BaseModel {

	private static final long serialVersionUID = -8182431694093811925L;

	@Column(name="NAME")
	private String name;
	
	@Column(name="ACTIVITY_CLASS")
	private String activityClass;

	@Column(name="CREATED_BY")
	private String createdBy;
	
}
