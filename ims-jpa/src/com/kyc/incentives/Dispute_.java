package com.kyc.incentives;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-15T10:58:52.409+0100")
@StaticMetamodel(Dispute.class)
public class Dispute_ extends BaseModel_ {
	public static volatile SingularAttribute<Dispute, String> name;
	public static volatile SingularAttribute<Dispute, String> comment;
	public static volatile SingularAttribute<Dispute, String> type;
	public static volatile SingularAttribute<Dispute, String> commentTimestamp;
	public static volatile SingularAttribute<Dispute, ValidationRecord> validationRecord;
}
