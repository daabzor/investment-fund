package com.mateuszstaskiewicz.investmentfund.calculator;


import com.mateuszstaskiewicz.investmentfund.model.investment.Investment;
import com.mateuszstaskiewicz.investmentfund.model.investment.InvestmentType;
import com.mateuszstaskiewicz.investmentfund.model.statics.CashFund;
import com.mateuszstaskiewicz.investmentfund.model.statics.ForeignFund;
import com.mateuszstaskiewicz.investmentfund.model.statics.InvestmentFund;
import com.mateuszstaskiewicz.investmentfund.model.statics.PolishFund;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BaseInvestmentTest {

    final static List<InvestmentFund> LIST_OF_2_POL_3_FOR_1_CASH_FUNDS = createFundsList(2,3,1);
    final static List<InvestmentFund> LIST_OF_3_POL_2_FOR_1_CASH_FUNDS = createFundsList(3,2,1);

    final Investment SAFE_INVESTMENT_AMOUNT_10000 = new Investment(InvestmentType.SAFE, "10000");
    final Investment SAFE_INVESTMENT_AMOUNT_10001 = new Investment(InvestmentType.SAFE, "10001");
    final Investment SAFE_INVESTMENT_AMOUNT_10005 = new Investment(InvestmentType.SAFE, "10005");

    final Investment AGGRESSIVE_INVESTMENT_AMOUNT_10000 = new Investment(InvestmentType.AGGRESSIVE, "10000");
    final Investment AGGRESSIVE_INVESTMENT_AMOUNT_10001 = new Investment(InvestmentType.AGGRESSIVE, "10001");
    final Investment AGGRESSIVE_INVESTMENT_AMOUNT_10005 = new Investment(InvestmentType.AGGRESSIVE, "10005");

    final Investment BALANCED_INVESTMENT_AMOUNT_10000 = new Investment(InvestmentType.BALANCED, "10000");
    final Investment BALANCED_INVESTMENT_AMOUNT_10001 = new Investment(InvestmentType.BALANCED, "10001");
    final Investment BALANCED_INVESTMENT_AMOUNT_10005 = new Investment(InvestmentType.BALANCED, "10005");

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
