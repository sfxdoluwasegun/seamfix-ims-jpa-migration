package com.kyc.incentives;

import com.kyc.incentives.enums.ApprovalChainStatus;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-21T13:11:17.124+0100")
@StaticMetamodel(ApprovalChain.class)
public class ApprovalChain_ extends BaseModel_ {
	public static volatile SingularAttribute<ApprovalChain, Integer> noOfLevels;
	public static volatile SingularAttribute<ApprovalChain, Integer> currentLevel;
	public static volatile SingularAttribute<ApprovalChain, Boolean> completed;
	public static volatile SingularAttribute<ApprovalChain, ApprovalChainStatus> status;
	public static volatile SingularAttribute<ApprovalChain, Date> terminationTime;
}
