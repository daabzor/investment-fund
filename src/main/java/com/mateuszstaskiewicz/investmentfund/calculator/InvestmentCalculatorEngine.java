package com.mateuszstaskiewicz.investmentfund.calculator;

import com.mateuszstaskiewicz.investmentfund.model.statics.FundType;
import com.mateuszstaskiewicz.investmentfund.model.statics.InvestmentFund;
import com.mateuszstaskiewicz.investmentfund.model.investment.Investment;
import com.mateuszstaskiewicz.investmentfund.model.strategy.Strategy;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InvestmentCalculatorEngine implements InvestmentCalculator {

    private BigDecimal amount;

    private List<InvestmentFund> fundList;

    private Strategy strategy;

    private final List<FundType> fundTypeList = Arrays.asList(FundType.POLISH, FundType.FOREIGN, FundType.CASH);

    public InvestmentCalculatorEngine(final Investment investment, final List<InvestmentFund> fundList) {
        this.amount = investment.getInvestmentAmount();
        this.strategy = investment.getInvestmentType().getStrategy();
        this.fundList = fundList;
    }

    private List<InvestmentFund> getFundsGroup(final FundType type) {
        return fundList.stream()
                .filter(fund -> fund.getFundType().equals(type))
                .collect(Collectors.toList());
    }

    private int getListSizeFor(final FundType type) {
        return getFundsGroup(type).size();
    }

    private BigDecimal getStrategyPercentForType(final FundType type) {
        return strategy.getStrategyRate(type);
    }

    @Override
    public GroupCalculator getCalculatedFund(final FundType type) {
        return new GroupFund(getFundsGroup(type), amount, getStrategyPercentForType(type));
    }

    @Override
    public String getUnSeparatedAmount() {
        return fundTypeList.stream()
                .map(a -> getCalculatedFund(a).getUnSeparatedAmount())
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .toString();
    }

    @Override
    public String getAggregatedAmountFor(final FundType type) {
        return getCalculatedFund(type).getDividedAmount()
                .multiply(new BigDecimal(getListSizeFor(type))).toString();
    }

    @Override
    public String getAggregatedPercentFor(final FundType type) {
        return getCalculatedFund(type).getDividedStrategyPercent()
                .multiply(new BigDecimal(getListSizeFor(type))).toString();
    }

}
