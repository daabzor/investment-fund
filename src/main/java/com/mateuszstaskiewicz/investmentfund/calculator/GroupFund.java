package com.mateuszstaskiewicz.investmentfund;

import com.mateuszstaskiewicz.investmentfund.GroupCalculator;
import com.mateuszstaskiewicz.investmentfund.model.statics.InvestmentFund;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
/**
    GroupFund class keeps information about list of funds, investment amount and investment strategy percent.
    This class is designed to work for each type of investment fund.
 */
public class GroupFund implements GroupCalculator {

    private List<? extends InvestmentFund> fundList;

    private BigDecimal amount;

    private BigDecimal strategyPercent;

    public GroupFund(List<? extends InvestmentFund> fundList, BigDecimal amount, BigDecimal strategyPercent) {
        this.fundList = fundList;
        this.amount = amount;
        this.strategyPercent = strategyPercent.setScale(4, RoundingMode.DOWN);
    }

    private BigDecimal getSizeOfGroup() {
        return new BigDecimal(fundList.stream().count());
    }

    @Override
    public BigDecimal getPercentOfInvestmentForOneFund() {
        return strategyPercent.divide(getSizeOfGroup(), 4, RoundingMode.DOWN);
    }

    @Override
    public BigDecimal getAmountOfInvestmentForOneFund() {
        return amount.multiply(strategyPercent).setScale(0, RoundingMode.DOWN)
                .divide(getSizeOfGroup(), 3, RoundingMode.HALF_UP).setScale(0, RoundingMode.DOWN);
    }

    @Override
    public BigDecimal getUnseparatedAmount() {
        return amount.multiply(strategyPercent)
                .subtract(getAmountOfInvestmentForOneFund().multiply(getSizeOfGroup()))
                .setScale(2, RoundingMode.DOWN);
    }
}
