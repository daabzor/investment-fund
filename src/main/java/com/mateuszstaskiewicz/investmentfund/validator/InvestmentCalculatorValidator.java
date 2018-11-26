package com.mateuszstaskiewicz.investmentfund.validator;

import com.mateuszstaskiewicz.investmentfund.exception.FundTypeListException;
import com.mateuszstaskiewicz.investmentfund.model.statics.FundType;
import com.mateuszstaskiewicz.investmentfund.model.statics.InvestmentFund;

import java.util.Arrays;
import java.util.List;

public class InvestmentCalculatorValidator {

    private static final List<FundType> fundTypeList = Arrays.asList(FundType.values());

    public static void validate(final List<? extends InvestmentFund> fundList) {
        validateList(fundList);
    }

    private static void validateList(final List<? extends InvestmentFund> fundList) {
        fundTypeList.forEach(type -> {
            if (fundList.stream().filter(fund -> fund.getFundType().equals(type)).count() < 1L) {
                throw new FundTypeListException("List should contains at least 1 polish, 1 foreign and 1 cash fund");
            }
        });
    }

}
