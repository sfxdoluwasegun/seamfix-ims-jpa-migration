package com.kyc.incentives;

import com.kyc.incentives.enums.TriggerHistoryStatus;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-30T19:36:54.367+0100")
@StaticMetamodel(IncentiveTriggerHistory.class)
public class IncentiveTriggerHistory_ extends BaseModel_ {
	public static volatile SingularAttribute<IncentiveTriggerHistory, AppUser> triggerAgent;
	public static volatile SingularAttribute<IncentiveTriggerHistory, BigDecimal> totalAmount;
	public static volatile SingularAttribute<IncentiveTriggerHistory, TriggerHistoryStatus> status;
	public static volatile SingularAttribute<IncentiveTriggerHistory, Date> startDate;
	public static volatile SingularAttribute<IncentiveTriggerHistory, Date> endDate;
	public static volatile SingularAttribute<IncentiveTriggerHistory, Boolean> active;
	public static volatile SingularAttribute<IncentiveTriggerHistory, Boolean> triggerType;
}
