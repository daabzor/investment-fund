package com.mateuszstaskiewicz.investmentfund;

import com.mateuszstaskiewicz.investmentfund.model.statics.FundType;
import com.mateuszstaskiewicz.investmentfund.model.statics.InvestmentFund;
import com.mateuszstaskiewicz.investmentfund.model.trades.Investment;
import com.mateuszstaskiewicz.investmentfund.strategy.Strategy;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InvestmentCalculatorEngine implements InvestmentCalculator {

    private BigDecimal amount;

    private List<InvestmentFund> fundList;

    private Strategy strategy;

    private List<FundType> fundTypeList = Arrays.asList(FundType.POLISH, FundType.FOREIGN, FundType.CASH);

    public InvestmentCalculatorEngine(Investment investment, List<InvestmentFund> fundList) {
        this.amount = investment.getInvestmentAmount();
        this.strategy = investment.getInvestmentType().getStrategy();
        this.fundList = fundList;
    }

    private List<InvestmentFund> getFundsGroup(FundType fundType) {
        return fundList.stream()
                .filter(fund -> fund.getFundType().equals(fundType))
                .collect(Collectors.toList());
    }

    private BigDecimal getStrategyPercentForType(FundType fundType) {
        return strategy.getStrategyRate(fundType);
    }

    private GroupCalculator getCalculatedFund(FundType fundType) {
        return new GroupFund(getFundsGroup(fundType), amount, getStrategyPercentForType(fundType));
    }

    @Override
    public String getAmountInFundForType(FundType fundType) {
        return getCalculatedFund(fundType).getAmountOfInvestmentForOneFund().toString();
    }

    @Override
    public String getPercentInFundForType(FundType fundType) {
        return getCalculatedFund(fundType).getPercentOfInvestmentForOneFund().toString();
    }

    @Override
    public String getUnSeparatedAmountForType(FundType fundType) {
        return getCalculatedFund(fundType).getUnseparatedAmount().toString();
    }

    @Override
    public String getUnSeparatedAmount() {
        return fundTypeList.stream().map(a -> getCalculatedFund(a).getUnseparatedAmount()).reduce(BigDecimal.ZERO, BigDecimal::add).toString();
    }

}
