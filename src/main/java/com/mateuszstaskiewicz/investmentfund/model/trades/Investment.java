package com.mateuszstaskiewicz.investmentfund.model.trades;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Investment {

    private InvestmentType investmentType;

    private BigDecimal investmentAmount;

    public Investment(InvestmentType investmentType, String investmentAmount) {
        this.investmentType = investmentType;
        this.investmentAmount = new BigDecimal(investmentAmount);
    }
}
