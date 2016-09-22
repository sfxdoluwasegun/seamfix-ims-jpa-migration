package com.kyc.incentives;

import com.kyc.incentives.enums.Duration;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-21T17:38:27.148+0100")
@StaticMetamodel(Incentive.class)
public class Incentive_ extends BaseModel_ {
	public static volatile SingularAttribute<Incentive, String> name;
	public static volatile SingularAttribute<Incentive, Double> amount;
	public static volatile SingularAttribute<Incentive, Duration> frequency;
	public static volatile SingularAttribute<Incentive, String> incentiveClass;
	public static volatile SingularAttribute<Incentive, ImsRole> role;
}
