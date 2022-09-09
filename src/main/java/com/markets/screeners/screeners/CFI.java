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
public class CFI implements Screener {

    private static final String SCREENER_NAME   = "CFI";
    private static final String SCREENER_SUFFIX = "I";

    @Override
    public ScreenerResult calculate(RatioDataDto ratioDataDto) {

        BigDecimal screenerResult = BigDecimal.valueOf(
                ratioDataDto.getCurrentRatio() * ratioDataDto.getAssetTurnover());

        return ScreenerUtility.createScreenerResult(SCREENER_NAME, SCREENER_SUFFIX, ratioDataDto, screenerResult);
    }

}
