/**
 * 
 */
package com.kyc.incentives.enums;

/**
 * @author dawuzi
 *
 */
public enum TargetScheduledPeriod {

	CURRENT_MONTH("Current Month"),
	PREVIOUS_MONTH("Previous Month"),
	;
	
	private String display;
	
	private TargetScheduledPeriod(String display) {
		this.display = display;
	}

	public String getDisplay() {
		return display;
	}
	
}
