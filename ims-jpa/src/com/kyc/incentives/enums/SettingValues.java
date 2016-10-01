package com.kyc.incentives.enums;

/**
 *
 * @author dawuzi
 */
public enum SettingValues {

    TARGET_INCENTIVE_OPERATOR_PACKAGES("", "comma seperated target class packages to scan for Implementations of Incentive Operator"),
//    default value is 1am on the first day of every month
    INCENTIVES_CALCULATION_TRIGGER("0 0 1 1 * ?", "the cron trigger expression for triggering the incentive calculation scheduled job"), 
    IMS_EMAIL("", "Email for sending email notification"), 
    IMS_EMAIL_SENDER_NAME("", "Email sender name"), 
    IMS_EMAIL_PASSWORD("", "Email password"), 
    IMS_EMAIL_HOST_NAME("", "Email host name"), 
    IMS_EMAIL_PORT("", "Email port"), 
    ;

    SettingValues(String defaultValue, String defaultDescription) {
        this.defaultValue = defaultValue;
        this.defaultDescription = defaultDescription;
    }

    private String defaultValue;

    private String defaultDescription;

    public String getDefaultValue() {
        return defaultValue;
    }
    public String getDefaultDescription() {
        return defaultDescription;
    }

}
