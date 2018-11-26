package com.mateuszstaskiewicz.investmentfund.model.strategy;

import com.mateuszstaskiewicz.investmentfund.model.statics.FundType;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BalancedStrategy extends AbstractStrategy {

    private static final Map<FundType, BigDecimal> STRATEGY = new HashMap<FundType, BigDecimal>(){{
        put(FundType.POLISH, new BigDecimal("0.30"));
        put(FundType.FOREIGN, new BigDecimal("0.60"));
        put(FundType.CASH, new BigDecimal("0.10"));

    }};

    public BalancedStrategy() {
        isStrategyValid(new ArrayList<>(STRATEGY.values()));
    }

    @Override
    public BigDecimal getStrategyRate(final FundType fundType) {
        return STRATEGY.get(fundType);
    }

}
