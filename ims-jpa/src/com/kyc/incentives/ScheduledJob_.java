package com.kyc.incentives;

import com.kyc.incentives.enums.TargetScheduledPeriod;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-10-03T15:47:21.393+0100")
@StaticMetamodel(ScheduledJob.class)
public class ScheduledJob_ extends BaseModel_ {
	public static volatile SingularAttribute<ScheduledJob, String> name;
	public static volatile SingularAttribute<ScheduledJob, Integer> dayOfMonth;
	public static volatile SingularAttribute<ScheduledJob, Date> triggerTime;
	public static volatile SingularAttribute<ScheduledJob, Boolean> triggerAllIncentives;
	public static volatile SetAttribute<ScheduledJob, Incentive> targetIncentives;
	public static volatile SingularAttribute<ScheduledJob, AppUser> user;
	public static volatile SingularAttribute<ScheduledJob, TargetScheduledPeriod> targetPeriod;
}
