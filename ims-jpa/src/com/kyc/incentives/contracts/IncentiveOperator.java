/**
 * 
 */
package com.kyc.incentives.contracts;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

import com.kyc.incentives.Incentive;
import com.kyc.incentives.SraaDealer;

/**
 * @author dawuzi
 *
 */
public interface IncentiveOperator {

	Map<SraaDealer, BigDecimal> calculateIncentives(Collection<SraaDealer> dealers, Collection<Incentive> incentiveOperators, Date startDate, Date endDate);
}
