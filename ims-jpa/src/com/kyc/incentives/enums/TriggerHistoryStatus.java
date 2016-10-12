/**
 * 
 */
package com.kyc.incentives.enums;

/**
 * @author dawuzi
 *
 */
public enum TriggerHistoryStatus {
	SUCCESS,
	FAILED,
	IN_PROGRESS,
	INCOMPLETE,
	@Deprecated //use in progress now
	PENDING,
	;
}
