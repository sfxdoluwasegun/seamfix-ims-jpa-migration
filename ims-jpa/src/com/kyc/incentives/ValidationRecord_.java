package com.kyc.incentives;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-15T10:40:13.979+0100")
@StaticMetamodel(ValidationRecord.class)
public class ValidationRecord_ extends BaseModel_ {
	public static volatile SingularAttribute<ValidationRecord, Long> kycBasicDataId;
	public static volatile SingularAttribute<ValidationRecord, Boolean> status;
	public static volatile SingularAttribute<ValidationRecord, Long> validatorOrbitaId;
	public static volatile SingularAttribute<ValidationRecord, String> validatorName;
	public static volatile SingularAttribute<ValidationRecord, Long> sraaDealerId;
	public static volatile SingularAttribute<ValidationRecord, String> sraaDealerName;
	public static volatile SingularAttribute<ValidationRecord, String> comment;
	public static volatile ListAttribute<ValidationRecord, Dispute> disputes;
}
