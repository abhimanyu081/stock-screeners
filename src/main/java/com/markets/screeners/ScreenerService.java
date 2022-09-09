package com.markets.screeners;

import com.markets.screeners.model.RatioDataDto;
import com.markets.screeners.model.ScreenerResult;
import com.markets.screeners.screeners.Screener;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author abhimanyu.abhimanyu1
 */
@Service
public class ScreenerService {

    private List<Screener> screeners;

    public ScreenerService(List<Screener> screeners) {
        this.screeners = screeners;
    }

    public List<ScreenerResult> calculateScreeners(RatioDataDto ratioDataDto) {

        return screeners.stream().map(screener -> screener.calculate(ratioDataDto)).collect(Collectors.toList());

    }
}
