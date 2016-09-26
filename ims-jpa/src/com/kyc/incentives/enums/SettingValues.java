package com.kyc.incentives.enums;

/**
 *
 * @author dawuzi
 */
public enum SettingValues {

    TARGET_INCENTIVE_OPERATOR_PACKAGES("", "comma seperated target class packages to scan for Implementations of Incentive Operator"),
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
