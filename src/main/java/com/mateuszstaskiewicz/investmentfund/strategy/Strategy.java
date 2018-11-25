package com.mateuszstaskiewicz.investmentfund.strategy;

import com.mateuszstaskiewicz.investmentfund.model.statics.FundType;

import java.math.BigDecimal;

public interface Strategy {

    BigDecimal getStrategyRate(FundType fundType);

}
