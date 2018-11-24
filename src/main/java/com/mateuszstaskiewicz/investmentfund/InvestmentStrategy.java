package com.mateuszstaskiewicz.investmentfund;

import com.mateuszstaskiewicz.investmentfund.model.statics.FundType;
import com.mateuszstaskiewicz.investmentfund.model.trades.InvestmentType;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class InvestmentStrategy implements Strategy {
    private static Map<InvestmentType, Map<FundType, BigDecimal>> strategies;

    static {
        Map safeStrategy = new HashMap(){{
            put(FundType.POLISH, new BigDecimal(0.20));
            put(FundType.FOREIGN, new BigDecimal(0.75));
            put(FundType.CASH, new BigDecimal(0.05));

        }};

        Map aggresiveStrategy = new HashMap(){{
            put(FundType.POLISH, new BigDecimal(0.40));
            put(FundType.FOREIGN, new BigDecimal(0.20));
            put(FundType.CASH, new BigDecimal(0.40));

        }};

        Map balancedStrategy = new HashMap(){{
            put(FundType.POLISH, new BigDecimal(0.30));
            put(FundType.FOREIGN, new BigDecimal(0.60));
            put(FundType.CASH, new BigDecimal(0.10));

        }};
        strategies = new HashMap(){{
            put(InvestmentType.SAFE, safeStrategy);
            put(InvestmentType.AGRESSIVE, aggresiveStrategy);
            put(InvestmentType.BALANCED, balancedStrategy);
        }};
    }

    public static Map<FundType, BigDecimal> get(InvestmentType investmentType) {
        return strategies.get(investmentType);
    }
}
