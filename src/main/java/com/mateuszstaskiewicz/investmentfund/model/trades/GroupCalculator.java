package com.mateuszstaskiewicz.investmentfund.model.trades;

import java.math.BigDecimal;

public interface GroupCalculator {

    BigDecimal getPercentOfInvestmentForOneFund();
    BigDecimal getAmountOfInvestmentForOneFund();
    BigDecimal getUnseparatedAmount();

}
