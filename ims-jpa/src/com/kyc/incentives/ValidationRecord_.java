package com.kyc.incentives;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-09T21:02:55.380+0100")
@StaticMetamodel(ValidationRecord.class)
public class ValidationRecord_ extends BaseModel_ {
	public static volatile SingularAttribute<ValidationRecord, Long> kycBasicDataId;
	public static volatile SingularAttribute<ValidationRecord, Boolean> status;
	public static volatile SingularAttribute<ValidationRecord, Long> validator;
	public static volatile SingularAttribute<ValidationRecord, Long> sraaDealer;
	public static volatile SingularAttribute<ValidationRecord, String> comment;
	public static volatile SingularAttribute<ValidationRecord, String> dispute;
}
