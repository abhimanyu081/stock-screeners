package com.markets.screeners.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RatioDataDto {

    private Long          companyId;
    private LocalDateTime yearEnding;
    private Double        InterestCoverage;
    private Double        InterestCoveragePostTax;
    private Double        PBDITMargin;
    private Double        PBITMargin;
    private Double        PBTMargin;
    private Double        NPMargin;
    private Double        NPAfterMIMargin;
    private Double        AssetTurnover;
    private Double        DebtEquity;
    private Double        LongTermDebtEquity;
    private Double        CurrentRatio;
    private Double        QuickRatio;
    private Double        RONW;
    private Double        ROCE;
    private Double        ReturnOnAssets;
    private Double        InventoryTurnoverRatio;
    private Double        OperatingRevenuePerShare;
    private Double        PBDITPerShare;
    private Double        PBITPerShare;
    private Double        PBTPerShare;
    private Double        NPperShare;
    private Double        NPAfterMIPerShare;
    private Double        DividendPayoutNP;
    private Double        DividendPayoutCP;
    private Double        EarningRetention;
    private Double        CashEarningRetention;
    private String        RowType;

}
