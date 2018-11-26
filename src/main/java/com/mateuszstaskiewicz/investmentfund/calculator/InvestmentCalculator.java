package com.mateuszstaskiewicz.investmentfund.calculator;

import com.mateuszstaskiewicz.investmentfund.model.statics.FundType;

public interface InvestmentCalculator {

    GroupCalculator getCalculatedFund(FundType type);

    String getUnSeparatedAmount();

    String getAggregatedAmountFor(FundType type);

    String getAggregatedPercentFor(FundType type);

}
