package com.mateuszstaskiewicz.investmentfund;

import com.mateuszstaskiewicz.investmentfund.model.statics.FundType;
import com.mateuszstaskiewicz.investmentfund.model.trades.GroupFund;

public interface InvestmentCalculator {

    GroupFund getCalculatedFund(FundType fundType);
}
