package com.markets.screeners.util;

import com.markets.screeners.model.RatioDataDto;
import com.markets.screeners.model.ScreenerResult;

import java.math.BigDecimal;

/**
 * @author abhimanyu.abhimanyu1
 */
public class ScreenerUtility {

    private static String OPENING_BRACKET = "(";
    private static String CLOSING_BRACKET = ")";

    public static String getInternalName(String screenerName, String screenerSuffix, int yearDelta) {
        int delta = DateUtility.currentYearDelta(yearDelta);

        if (delta != 0) {
            return new StringBuilder(screenerName).append(OPENING_BRACKET).append(screenerSuffix).append("-")
                    .append(delta).append(CLOSING_BRACKET).toString();
        } else {
            return new StringBuilder(screenerName).append(OPENING_BRACKET).append(screenerSuffix)
                    .append(CLOSING_BRACKET).toString();
        }

    }

    public static ScreenerResult createScreenerResult(String screenerName, String screenerSuffix,
            RatioDataDto ratioDataDto, BigDecimal screenerResult) {
        return new ScreenerResult(getInternalName(screenerName, screenerSuffix, ratioDataDto.getYearEnding().getYear()),
                screenerName, ratioDataDto.getYearEnding().getYear(), screenerResult);
    }

}
