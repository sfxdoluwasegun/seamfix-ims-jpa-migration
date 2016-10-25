package com.kyc.incentives;

import com.kyc.incentives.enums.PaymentStatus;
import com.kyc.incentives.enums.TriggerHistoryStatus;
import com.kyc.incentives.enums.TriggerType;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-10-25T09:51:57.519+0100")
@StaticMetamodel(IncentiveTriggerHistory.class)
public class IncentiveTriggerHistory_ extends BaseModel_ {
	public static volatile SingularAttribute<IncentiveTriggerHistory, AppUser> triggerAgent;
	public static volatile SingularAttribute<IncentiveTriggerHistory, BigDecimal> totalAmount;
	public static volatile SingularAttribute<IncentiveTriggerHistory, TriggerHistoryStatus> status;
	public static volatile SingularAttribute<IncentiveTriggerHistory, Date> startDate;
	public static volatile SingularAttribute<IncentiveTriggerHistory, Date> endDate;
	public static volatile SingularAttribute<IncentiveTriggerHistory, Boolean> active;
	public static volatile SingularAttribute<IncentiveTriggerHistory, TriggerType> triggerType;
	public static volatile SingularAttribute<IncentiveTriggerHistory, PaymentStatus> paymentStatus;
	public static volatile SingularAttribute<IncentiveTriggerHistory, String> name;
}
