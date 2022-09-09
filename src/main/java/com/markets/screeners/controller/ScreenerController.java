package com.markets.screeners.controller;

import com.markets.screeners.ScreenerService;
import com.markets.screeners.model.RatioDataDto;
import com.markets.screeners.model.ScreenerResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author abhimanyu.abhimanyu1
 */
@RestController
@RequestMapping("/screener")
public class ScreenerController {

    private ScreenerService screenerService;

    public ScreenerController(ScreenerService screenerService) {
        this.screenerService = screenerService;
    }

    @GetMapping
    public List<ScreenerResult> calculateScreenerForAll() {
        return screenerService.calculateScreeners(
                RatioDataDto.builder().AssetTurnover(10d).CurrentRatio(5.0d).CashEarningRetention(20d)
                        .EarningRetention(100d).yearEnding(LocalDateTime.now()).build());

    }
}
