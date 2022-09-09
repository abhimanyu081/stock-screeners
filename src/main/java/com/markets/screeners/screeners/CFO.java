package com.markets.screeners.screeners;

import com.markets.screeners.model.RatioDataDto;
import com.markets.screeners.model.ScreenerResult;
import com.markets.screeners.util.ScreenerUtility;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author abhimanyu.abhimanyu1
 */
@Service
public class CFO implements Screener {

    private static final String SCREENER_NAME   = "CFO";
    private static final String SCREENER_SUFFIX = "L";

    @Override
    public ScreenerResult calculate(RatioDataDto ratioDataDto) {
        BigDecimal screenerResult = BigDecimal.valueOf(
                ratioDataDto.getCurrentRatio() * ratioDataDto.getAssetTurnover());

        return ScreenerUtility.createScreenerResult(SCREENER_NAME, SCREENER_SUFFIX, ratioDataDto, screenerResult);

    }

}
