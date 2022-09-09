package com.markets.screeners.util;

import java.time.LocalDateTime;

/**
 * @author abhimanyu.abhimanyu1
 */
public class DateUtility {

    public static int currentYearDelta(int year) {

        LocalDateTime localDateTime = LocalDateTime.now();
        int currentYear = localDateTime.getYear();

        return currentYear - year;

    }

}
