package com.kyc.incentives;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-21T13:11:17.686+0100")
@StaticMetamodel(ApprovalChainLevel.class)
public class ApprovalChainLevel_ extends BaseModel_ {
	public static volatile SingularAttribute<ApprovalChainLevel, Integer> level;
	public static volatile SingularAttribute<ApprovalChainLevel, Integer> minimumApprovalCount;
	public static volatile SingularAttribute<ApprovalChainLevel, Integer> currentApprovalCount;
	public static volatile SingularAttribute<ApprovalChainLevel, Boolean> completed;
	public static volatile SetAttribute<ApprovalChainLevel, ImsRole> authorizedRoles;
	public static volatile SingularAttribute<ApprovalChainLevel, ApprovalChain> approvalChain;
}
