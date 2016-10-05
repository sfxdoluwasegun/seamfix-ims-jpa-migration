package com.kyc.incentives;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Entity implementation class for Entity: BaseModel
 *
 */

@Getter
@Setter
@EqualsAndHashCode(of="id")
@MappedSuperclass
public class BaseModel implements Serializable {
	
	private static final long serialVersionUID = -6844587302577812858L;
	
	@Id
	@GeneratedValue
	@Column(name="ID", nullable=false, insertable=true, updatable=false)
	private Long id;

	@Column(name="CREATE_DATE", nullable=false, insertable=true, updatable=false)
	private Date createDate = new Date();
	
}
