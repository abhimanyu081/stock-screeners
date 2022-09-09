package com.markets.screeners.screeners;

import com.markets.screeners.model.RatioDataDto;
import com.markets.screeners.model.ScreenerResult;

/**
 * @author abhimanyu.abhimanyu1
 */
public interface Screener {

    ScreenerResult calculate(RatioDataDto ratioDataDto);

}
