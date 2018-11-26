package com.mateuszstaskiewicz.investmentfund.model.investment;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Investment {

    private InvestmentType investmentType;

    private BigDecimal investmentAmount;

    public Investment(final InvestmentType investmentType, final String investmentAmount) {
        this.investmentType = investmentType;
        this.investmentAmount = new BigDecimal(investmentAmount);
    }

}
