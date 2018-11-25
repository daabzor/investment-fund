package com.mateuszstaskiewicz.investmentfund.strategy;

import com.mateuszstaskiewicz.investmentfund.model.statics.FundType;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AggressiveStrategy extends AbstractStrategy {

    private Map<FundType, BigDecimal> strategy = new HashMap<FundType, BigDecimal>(){{
        put(FundType.POLISH, new BigDecimal("0.40"));
        put(FundType.FOREIGN, new BigDecimal("0.20"));
        put(FundType.CASH, new BigDecimal("0.40"));

    }};

    public AggressiveStrategy() {
        isStrategyValid(new ArrayList<>(strategy.values()));
    }

    @Override
    public BigDecimal getStrategyRate(FundType fundType) {
        return strategy.get(fundType);
    }

}
