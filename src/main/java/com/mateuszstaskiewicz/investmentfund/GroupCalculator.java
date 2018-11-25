package com.mateuszstaskiewicz.investmentfund;

import java.math.BigDecimal;

public interface GroupCalculator {

    BigDecimal getPercentOfInvestmentForOneFund();
    BigDecimal getAmountOfInvestmentForOneFund();
    BigDecimal getUnseparatedAmount();

}
