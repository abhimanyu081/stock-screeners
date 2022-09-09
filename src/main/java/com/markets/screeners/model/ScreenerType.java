package com.markets.screeners.model;

import java.math.BigDecimal;

/**
 * @author abhimanyu.abhimanyu1
 */
public enum ScreenerType {

    CFO("L") {
        @Override
        public BigDecimal calculate(RatioDataDto ratioDataDto) {
            return BigDecimal.valueOf(ratioDataDto.getAssetTurnover() * ratioDataDto.getCurrentRatio());
        }
    },

    CFI("I") {
        @Override
        public BigDecimal calculate(RatioDataDto ratioDataDto) {
            return BigDecimal.valueOf(ratioDataDto.getAssetTurnover() * ratioDataDto.getCurrentRatio());
        }
    };
    private String suffix;

    ScreenerType(String suffix) {
        this.suffix = suffix;
    }

    public abstract BigDecimal calculate(RatioDataDto ratioDataDto);

    public String getSuffix() {
        return suffix;
    }
}
