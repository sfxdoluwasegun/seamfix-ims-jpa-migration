package com.kyc.incentives;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-12-01T14:37:01.812+0100")
@StaticMetamodel(AppUser.class)
public class AppUser_ extends BaseModel_ {
	public static volatile SingularAttribute<AppUser, Long> orbitaId;
	public static volatile SingularAttribute<AppUser, String> email;
	public static volatile SingularAttribute<AppUser, String> name;
	public static volatile SingularAttribute<AppUser, Long> referencedId;
	public static volatile SingularAttribute<AppUser, AppUser> topMostUpLineUser;
	public static volatile SingularAttribute<AppUser, AppUser> directUpLineUser;
	public static volatile SingularAttribute<AppUser, Boolean> bottom;
	public static volatile SetAttribute<AppUser, AppUser> upLineUsers;
	public static volatile SetAttribute<AppUser, ImsRole> roles;
}
