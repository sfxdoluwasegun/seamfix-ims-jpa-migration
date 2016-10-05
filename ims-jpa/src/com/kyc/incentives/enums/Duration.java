/**
 * 
 */
package com.kyc.incentives.enums;

/**
 * @author dawuzi
 *
 */
public enum Duration {
	YEAR(12), 
	MONTH(1), 
	QUARTER(3),
	;
	
	private Duration(int monthCount){
		this.monthCount = monthCount;
	}
	
	private int monthCount;

	public int getMonthCount() {
		return monthCount;
	}
}
