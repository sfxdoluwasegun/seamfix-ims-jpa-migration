/**
 * 
 */
package com.kyc.incentives;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

/**
 * @author dawuzi
 *
 */
@Entity
@Getter
@Setter
public class Dispute extends BaseModel {

	private static final long serialVersionUID = -244747829503249313L;

	@Column(name="NAME")
	private String name;
	
	@Column(name="COMMENT")
	private String comment;
	
	@Column(name="TYPE")
	private String type;

	@Column(name="COMMENT_TIMESTAMP")
	private String commentTimestamp; //String for demo purpose
	
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="validationRecord", nullable=false)
	private ValidationRecord validationRecord;
	
}
