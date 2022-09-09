package com.markets.screeners;

import com.markets.screeners.model.RatioDataDto;
import com.markets.screeners.model.ScreenerResult;
import com.markets.screeners.model.ScreenerType;
import com.markets.screeners.util.ScreenerUtility;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author abhimanyu.abhimanyu1
 */
@Service
public class ScreenerService {

    public List<ScreenerResult> calculateScreeners(RatioDataDto ratioDataDto) {
        return Arrays.stream(ScreenerType.values()).map(sc -> {
            BigDecimal result = sc.calculate(ratioDataDto);
            return ScreenerUtility.createScreenerResult(sc.name(), sc.getSuffix(), ratioDataDto, result);
        }).collect(Collectors.toList());

    }
}
