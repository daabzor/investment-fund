package com.mateuszstaskiewicz.investmentfund.calculator;

import com.mateuszstaskiewicz.investmentfund.model.statics.FundType;
import com.mateuszstaskiewicz.investmentfund.model.statics.InvestmentFund;

import java.util.Map;


public interface InvestmentCalculator {

    GroupCalculator getCalculatedFund(FundType fundType);

    String getUnSeparatedAmount();

    String getAggregatedAmountForType(FundType fundType);

    String getAggregatedPercentForType(FundType fundType);

    Map<InvestmentFund, Map<String, String>> getAggregatedInvestmentInfoForType(FundType type);
}
