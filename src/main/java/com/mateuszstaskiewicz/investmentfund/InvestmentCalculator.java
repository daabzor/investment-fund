package com.mateuszstaskiewicz.investmentfund;

import com.mateuszstaskiewicz.investmentfund.model.statics.FundType;

import java.math.BigDecimal;

public interface InvestmentCalculator {

    String getAmountInFundForType(FundType fundType);
    String getPercentInFundForType(FundType fundType);
    String getUnSeparatedAmount();
}
