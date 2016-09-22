/**
 * 
 */
package com.kyc.incentives.contracts;

import java.util.Collection;
import java.util.Date;
import java.util.Map;

import com.kyc.incentives.SraaDealer;

/**
 * @author dawuzi
 *
 */
public interface ActivityOperator {

	Map<SraaDealer, Long> getActivityCount(Collection<SraaDealer> dealers, Date startDate, Date endDate);
}
