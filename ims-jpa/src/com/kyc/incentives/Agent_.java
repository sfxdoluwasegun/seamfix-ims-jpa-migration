package com.kyc.incentives;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-14T22:29:59.805+0100")
@StaticMetamodel(Agent.class)
public class Agent_ extends BaseModel_ {
	public static volatile SingularAttribute<Agent, Long> kycBasicDataId;
	public static volatile SingularAttribute<Agent, Long> kycKmuserId;
	public static volatile SingularAttribute<Agent, SraaDealer> sraaDealer;
	public static volatile SingularAttribute<Agent, SandD> sAndD;
}
