package com.mateuszstaskiewicz.investmentfund;


import com.mateuszstaskiewicz.investmentfund.calculator.GroupCalculator;
import com.mateuszstaskiewicz.investmentfund.calculator.GroupFund;
import com.mateuszstaskiewicz.investmentfund.model.statics.CashFund;
import com.mateuszstaskiewicz.investmentfund.model.statics.ForeignFund;
import com.mateuszstaskiewicz.investmentfund.model.statics.InvestmentFund;
import com.mateuszstaskiewicz.investmentfund.model.statics.PolishFund;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BaseInvestmentTest {

    /*
    It's better to avoid loops in tests. For loops always introduce more complexity in the code.
    In tests we should rely on static data.
    Loops in this case will be replaced in nearly future.
     */
    GroupCalculator createGroupCalculator(int elements, String investmentAmount, String percentStrategy) {
        List<InvestmentFund> fundList = new ArrayList<>();
        for(int i = 0; i < elements; i++) {
            fundList.add(new PolishFund("Test fund"));
        }
        return new GroupFund(fundList, new BigDecimal(investmentAmount), new BigDecimal(percentStrategy));
    }

    static List<InvestmentFund> createFundsList(int polishFunds, int foreignFunds, int cashFunds) {
        final List<InvestmentFund> fundList = createPolishFundsList(polishFunds);
        fundList.addAll(createForeignFundsList(foreignFunds));
        fundList.addAll(createCashFundsList(cashFunds));
        return fundList;
    }

    private static List<InvestmentFund> createPolishFundsList(int elements) {
        List<InvestmentFund> fundList = new ArrayList<>();
        for(int i = 0; i < elements; i++) {
            fundList.add(new PolishFund("Fundusz polski"));
        }
        return fundList;
    }

    private static List<InvestmentFund> createForeignFundsList(int elements) {
        List<InvestmentFund> fundList = new ArrayList<>();
        for(int i = 0; i < elements; i++) {
            fundList.add(new ForeignFund("Fundusz zagraniczny"));
        }
        return fundList;
    }

    private static List<InvestmentFund> createCashFundsList(int elements) {
        List<InvestmentFund> fundList = new ArrayList<>();
        for(int i = 0; i < elements; i++) {
            fundList.add(new CashFund("Fundusz gotówkowy"));
        }
        return fundList;
    }
}
