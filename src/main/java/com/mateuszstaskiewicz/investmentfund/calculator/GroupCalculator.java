package com.mateuszstaskiewicz.investmentfund.calculator;

import java.math.BigDecimal;

public interface GroupCalculator {

    BigDecimal getPercentOfInvestmentForOneFund();
    BigDecimal getAmountOfInvestmentForOneFund();
    BigDecimal getUnseparatedAmount();

}
