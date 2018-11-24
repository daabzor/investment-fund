package com.mateuszstaskiewicz.investmentfund;

import com.mateuszstaskiewicz.investmentfund.model.statics.FundType;
import com.mateuszstaskiewicz.investmentfund.model.statics.InvestmentFund;
import com.mateuszstaskiewicz.investmentfund.model.trades.GroupCalculator;
import com.mateuszstaskiewicz.investmentfund.model.trades.GroupFund;
import com.mateuszstaskiewicz.investmentfund.model.trades.Investment;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@AllArgsConstructor
public class InvestmentCalculatorEngine implements InvestmentCalculator {

    private BigDecimal amount;

    private List<InvestmentFund> fundsGroup;

    private Map<FundType, BigDecimal> strategy;

    public InvestmentCalculatorEngine(Investment investment, List<InvestmentFund> fundsGroup) {
        this.amount = investment.getInvestmentAmount();
        this.strategy = InvestmentStrategy.get(investment.getInvestmentType());
        this.fundsGroup = fundsGroup;
    }

    private List<InvestmentFund> getFundsGroup(FundType fundType) {
        return fundsGroup.stream()
                .filter(fund -> fund.getFundType().equals(fundType))
                .collect(Collectors.toList());
    }

    private int getSizeOfFundList(FundType fundType) {
        return getFundsGroup(fundType).size();
    }

    private BigDecimal getStrategyPercentForType(FundType fundType) {
        return strategy.get(fundType);
    }

    @Override
    public GroupFund getCalculatedFund(FundType fundType) {
        GroupCalculator groupFund = new GroupFund(getFundsGroup(fundType), amount, getStrategyPercentForType(fundType));
        return null;
    }

//    public BigDecimal getNotSharedAmount() {
//        Stream.of(amount).
//    }

}
