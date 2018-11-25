package com.mateuszstaskiewicz.investmentfund.model.trades;

import com.mateuszstaskiewicz.investmentfund.strategy.AggressiveStrategy;
import com.mateuszstaskiewicz.investmentfund.strategy.BalancedStrategy;
import com.mateuszstaskiewicz.investmentfund.strategy.SafeStrategy;
import com.mateuszstaskiewicz.investmentfund.strategy.Strategy;

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
