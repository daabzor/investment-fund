package com.mateuszstaskiewicz.investmentfund.model.investment;

import com.mateuszstaskiewicz.investmentfund.model.strategy.AggressiveStrategy;
import com.mateuszstaskiewicz.investmentfund.model.strategy.BalancedStrategy;
import com.mateuszstaskiewicz.investmentfund.model.strategy.SafeStrategy;
import com.mateuszstaskiewicz.investmentfund.model.strategy.Strategy;

public enum InvestmentType {

    AGGRESSIVE(new AggressiveStrategy()),
    SAFE(new SafeStrategy()),
    BALANCED(new BalancedStrategy());

    private Strategy strategy;

    InvestmentType(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }
}
