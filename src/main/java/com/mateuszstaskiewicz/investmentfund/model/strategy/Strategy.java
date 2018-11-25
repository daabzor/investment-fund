package com.mateuszstaskiewicz.investmentfund.model.strategy;

import com.mateuszstaskiewicz.investmentfund.model.statics.FundType;

import java.math.BigDecimal;

public interface Strategy {

    BigDecimal getStrategyRate(FundType fundType);

}
