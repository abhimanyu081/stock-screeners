package com.markets.screeners.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author abhimanyu.abhimanyu1
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScreenerResult {

    private String     internalName;
    private String     screenerName;
    private int        year;
    private BigDecimal result;
}
