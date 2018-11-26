package com.mateuszstaskiewicz.investmentfund.model.strategy;

import com.mateuszstaskiewicz.investmentfund.model.statics.FundType;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AggressiveStrategy extends AbstractStrategy {

    private static final Map<FundType, BigDecimal> STRATEGY = new HashMap<FundType, BigDecimal>(){{
        put(FundType.POLISH, new BigDecimal("0.40"));
        put(FundType.FOREIGN, new BigDecimal("0.20"));
        put(FundType.CASH, new BigDecimal("0.40"));

    }};

    public AggressiveStrategy() {
        isStrategyValid(new ArrayList<>(STRATEGY.values()));
    }

    @Override
    public BigDecimal getStrategyRate(final FundType fundType) {
        return STRATEGY.get(fundType);
    }

}
