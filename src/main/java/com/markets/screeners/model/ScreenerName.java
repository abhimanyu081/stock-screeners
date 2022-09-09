package com.markets.screeners.model;

/**
 * @author abhimanyu.abhimanyu1
 */
public enum ScreenerName {

    CFO("L"),
    CFI("I");

    private String suffix;

    ScreenerName(String suffix) {
        this.suffix = suffix;
    }

    public String getSuffix() {
        return suffix;
    }
}
