package com.mateuszstaskiewicz.investmentfund.calculator;

import java.math.BigDecimal;

public interface GroupCalculator {

    BigDecimal getDividedStrategyPercent();

    BigDecimal getDividedAmount();

    BigDecimal getUnSeparatedAmount();

}
