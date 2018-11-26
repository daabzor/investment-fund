package com.mateuszstaskiewicz.investmentfund.calculator;

import com.mateuszstaskiewicz.investmentfund.model.statics.InvestmentFund;
import com.mateuszstaskiewicz.investmentfund.validator.GroupCalculatorValidator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class GroupFund implements GroupCalculator {

    private List<? extends InvestmentFund> fundList;

    private BigDecimal amount;

    private BigDecimal strategyPercent;

    public GroupFund(final List<? extends InvestmentFund> fundList, final BigDecimal amount, final BigDecimal strategyPercent) {
        GroupCalculatorValidator.validate(fundList, amount, strategyPercent);
        this.fundList = fundList;
        this.amount = amount;
        this.strategyPercent = strategyPercent.setScale(4, RoundingMode.DOWN);
    }

    private BigDecimal getSizeOfGroup() {
        return new BigDecimal(fundList.stream().count());
    }

    @Override
    public BigDecimal getDividedStrategyPercent() {
        return strategyPercent.divide(getSizeOfGroup(), 4, RoundingMode.DOWN);
    }

    @Override
    public BigDecimal getDividedAmount() {
        return amount.multiply(strategyPercent).setScale(0, RoundingMode.DOWN)
                .divide(getSizeOfGroup(), 3, RoundingMode.HALF_UP).setScale(0, RoundingMode.DOWN);
    }

    @Override
    public BigDecimal getUnSeparatedAmount() {
        return amount.multiply(strategyPercent)
                .subtract(getDividedAmount().multiply(getSizeOfGroup()))
                .setScale(2, RoundingMode.DOWN);
    }

}
