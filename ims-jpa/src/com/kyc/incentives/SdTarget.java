package com.kyc.incentives;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class SdTarget extends BaseModel {

	private static final long serialVersionUID = -1060349135876200341L;

	@Column(name="AGENTS")
	private List<Agent> agents;

}
