package com.mateuszstaskiewicz.investmentfund.calculator;

import com.mateuszstaskiewicz.investmentfund.model.statics.FundType;
import com.mateuszstaskiewicz.investmentfund.model.statics.InvestmentFund;
import com.mateuszstaskiewicz.investmentfund.model.investment.Investment;
import com.mateuszstaskiewicz.investmentfund.model.strategy.Strategy;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

    private int getListSizeFor(FundType fundType) {
        return getFundsGroup(fundType).size();
    }

    private BigDecimal getStrategyPercentForType(FundType fundType) {
        return strategy.getStrategyRate(fundType);
    }

    public GroupCalculator getCalculatedFund(FundType fundType) {
        return new GroupFund(getFundsGroup(fundType), amount, getStrategyPercentForType(fundType));
    }

    @Override
    public String getUnSeparatedAmount() {
        return fundTypeList.stream()
                .map(a -> getCalculatedFund(a).getUnseparatedAmount())
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .toString();
    }

    @Override
    public String getAggregatedAmountFor(FundType fundType) {
        return getCalculatedFund(fundType).getDividedAmount()
                .multiply(new BigDecimal(getListSizeFor(fundType))).toString();
    }

    @Override
    public String getAggregatedPercentFor(FundType fundType) {
        return getCalculatedFund(fundType).getDividedStrategyPercent()
                .multiply(new BigDecimal(getListSizeFor(fundType))).toString();
    }

    public Map<InvestmentFund, Map<String, String>> getAggregatedInvestmentInfoForType(FundType type) {
        return getFundsGroup(type).stream().collect(Collectors.toMap(type2 -> type2, type3 -> new HashMap<String, String>() {{
            put("", "");
        }}));
//
//         getFundsGroup(type).stream().collect(
//                Collectors.groupingBy(a -> a, Collectors.collectingAndThen(
//                        Collectors.groupingBy(Product::getChannelIdentifier), Map::values)));

    }

}
