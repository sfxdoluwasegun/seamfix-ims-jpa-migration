package com.kyc.incentives;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-28T22:01:21.632+0100")
@StaticMetamodel(AppUser.class)
public class AppUser_ extends BaseModel_ {
	public static volatile SingularAttribute<AppUser, Long> orbitaId;
	public static volatile SingularAttribute<AppUser, String> email;
	public static volatile SetAttribute<AppUser, ImsRole> roles;
}
