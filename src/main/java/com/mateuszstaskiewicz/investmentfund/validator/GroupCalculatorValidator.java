package com.mateuszstaskiewicz.investmentfund.validator;

import com.mateuszstaskiewicz.investmentfund.exception.EmptyListException;
import com.mateuszstaskiewicz.investmentfund.exception.WrongValuesGroupException;
import com.mateuszstaskiewicz.investmentfund.model.statics.InvestmentFund;

import java.math.BigDecimal;
import java.util.List;

public class GroupCalculatorValidator {

    public static void validate(final List<? extends InvestmentFund> fundList, BigDecimal amount, BigDecimal strategyPercent) {
        validateList(fundList);
        validateValues(amount);
    }

    private static void validateList(final List<? extends InvestmentFund> fundList) {
        if(fundList.isEmpty()) {
            throw new EmptyListException("Funds list can not be empty.");
        }
    }

    private static void validateValues(final BigDecimal amount) {

        if(amount.compareTo(new BigDecimal("100")) < 0) {
            throw new WrongValuesGroupException("Investment amount can not be less than 100.");
        }

    }

}
