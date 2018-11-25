package com.mateuszstaskiewicz.investmentfund.strategy;

import com.mateuszstaskiewicz.investmentfund.model.statics.FundType;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BalancedStrategy extends AbstractStrategy {

    private Map<FundType, BigDecimal> strategy = new HashMap<FundType, BigDecimal>(){{
        put(FundType.POLISH, new BigDecimal("0.30"));
        put(FundType.FOREIGN, new BigDecimal("0.60"));
        put(FundType.CASH, new BigDecimal("0.10"));

    }};

    public BalancedStrategy() {
        isStrategyValid(new ArrayList<>(strategy.values()));
    }

    @Override
    public BigDecimal getStrategyRate(FundType fundType) {
        return strategy.get(fundType);
    }

}
