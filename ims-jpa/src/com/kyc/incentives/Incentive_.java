package com.kyc.incentives;

import com.kyc.incentives.enums.Duration;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-11-23T09:06:30.938+0100")
@StaticMetamodel(Incentive.class)
public class Incentive_ extends BaseModel_ {
	public static volatile SingularAttribute<Incentive, String> name;
	public static volatile SingularAttribute<Incentive, Double> amount;
	public static volatile SingularAttribute<Incentive, Duration> frequencyType;
	public static volatile SingularAttribute<Incentive, Integer> frequency;
	public static volatile SingularAttribute<Incentive, String> incentiveClass;
	public static volatile SingularAttribute<Incentive, Boolean> deduction;
	public static volatile SingularAttribute<Incentive, Boolean> opportunityLoss;
	public static volatile SingularAttribute<Incentive, Boolean> active;
	public static volatile SetAttribute<Incentive, ImsRole> targetRoles;
	public static volatile SingularAttribute<Incentive, AppUser> targetAgent;
}
