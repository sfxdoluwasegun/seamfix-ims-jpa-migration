package com.kyc.incentives;

import com.kyc.incentives.enums.TriggerHistoryStatus;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-22T11:45:47.235+0100")
@StaticMetamodel(IncentiveUserTriggerHistory.class)
public class IncentiveUserTriggerHistory_ extends BaseModel_ {
	public static volatile SingularAttribute<IncentiveUserTriggerHistory, AppUser> user;
	public static volatile SingularAttribute<IncentiveUserTriggerHistory, Incentive> incentive;
	public static volatile SingularAttribute<IncentiveUserTriggerHistory, BigDecimal> amount;
	public static volatile SingularAttribute<IncentiveUserTriggerHistory, Double> unitAmount;
	public static volatile SingularAttribute<IncentiveUserTriggerHistory, Long> unitCount;
	public static volatile SingularAttribute<IncentiveUserTriggerHistory, Date> startDate;
	public static volatile SingularAttribute<IncentiveUserTriggerHistory, Date> endDate;
	public static volatile SingularAttribute<IncentiveUserTriggerHistory, Boolean> active;
	public static volatile SingularAttribute<IncentiveUserTriggerHistory, Date> triggerStartTime;
	public static volatile SingularAttribute<IncentiveUserTriggerHistory, Date> triggerEndTime;
	public static volatile SingularAttribute<IncentiveUserTriggerHistory, TriggerHistoryStatus> status;
	public static volatile SingularAttribute<IncentiveUserTriggerHistory, IncentiveTriggerHistory> incentiveTriggerHistory;
}
