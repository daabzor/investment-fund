package com.mateuszstaskiewicz.investmentfund.calculator;

import com.mateuszstaskiewicz.investmentfund.model.statics.*;
import com.mateuszstaskiewicz.investmentfund.model.investment.Investment;
import com.mateuszstaskiewicz.investmentfund.model.investment.InvestmentType;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class InvestmentCalculatorTest extends BaseInvestmentTest {

    private static List<InvestmentFund> LIST_OF_2_POL_3_FOR_1_CASH_FUNDS;

    @BeforeClass
    public static void setupInitialData() {
        LIST_OF_2_POL_3_FOR_1_CASH_FUNDS = createFundsList(2,3,1);
    }

    @Test
    public void getAmountInFundForTypeTest1() {
        //given
        final Investment investment = new Investment(InvestmentType.SAFE, "10000");
        final InvestmentCalculator investmentCalculator = new InvestmentCalculatorEngine(investment, LIST_OF_2_POL_3_FOR_1_CASH_FUNDS);

        //when
        final String amountForPolishFund = investmentCalculator.getCalculatedFund(FundType.POLISH).getAmountOfInvestmentForOneFund().toString();
        final String amountForForeignFund = investmentCalculator.getCalculatedFund(FundType.FOREIGN).getAmountOfInvestmentForOneFund().toString();
        final String amountForCashFund = investmentCalculator.getCalculatedFund(FundType.CASH).getAmountOfInvestmentForOneFund().toString();

        final String aggregatedAmountForPolishFund = investmentCalculator.getAggregatedAmountForType(FundType.POLISH);
        final String aggregatedAmountForForeignFund = investmentCalculator.getAggregatedAmountForType(FundType.FOREIGN);
        final String aggregatedAmountForCashFund = investmentCalculator.getAggregatedAmountForType(FundType.CASH);

        //then
        assertEquals("1000", amountForPolishFund);
        assertEquals("2500", amountForForeignFund);
        assertEquals("500", amountForCashFund);

        assertEquals("2000", aggregatedAmountForPolishFund);
        assertEquals("7500", aggregatedAmountForForeignFund);
        assertEquals("500", aggregatedAmountForCashFund);

    }

    @Test
    public void getPercentInFundForTypeTest1() {
        //given
        final Investment investment = new Investment(InvestmentType.SAFE, "10000");
        final InvestmentCalculator investmentCalculator = new InvestmentCalculatorEngine(investment, LIST_OF_2_POL_3_FOR_1_CASH_FUNDS);

        //when
        final String percentForPolishFund = investmentCalculator.getCalculatedFund(FundType.POLISH).getPercentOfInvestmentForOneFund().toString();
        final String percentForForeignFund = investmentCalculator.getCalculatedFund(FundType.FOREIGN).getPercentOfInvestmentForOneFund().toString();
        final String percentForCashFund = investmentCalculator.getCalculatedFund(FundType.CASH).getPercentOfInvestmentForOneFund().toString();

        final String aggregatedPercentForPolishFund = investmentCalculator.getAggregatedPercentForType(FundType.POLISH);
        final String aggregatedPercentForForeignFund = investmentCalculator.getAggregatedPercentForType(FundType.FOREIGN);
        final String aggregatedPercentForCashFund = investmentCalculator.getAggregatedPercentForType(FundType.CASH);

        //then
        assertEquals("0.1000", percentForPolishFund);
        assertEquals("0.2500", percentForForeignFund);
        assertEquals("0.0500", percentForCashFund);

        assertEquals("0.2000", aggregatedPercentForPolishFund);
        assertEquals("0.7500", aggregatedPercentForForeignFund);
        assertEquals("0.0500", aggregatedPercentForCashFund);

    }

    @Test
    public void getUnSeparatedAmountForTypeTest1() {
        //given - test data above
        final Investment investment = new Investment(InvestmentType.SAFE, "10000");
        final InvestmentCalculator investmentCalculator = new InvestmentCalculatorEngine(investment, LIST_OF_2_POL_3_FOR_1_CASH_FUNDS);

        //when
        final String unSeparatedAmountForPolishFund = investmentCalculator.getCalculatedFund(FundType.POLISH).getUnseparatedAmount().toString();
        final String unSeparatedAmountForForeignFund = investmentCalculator.getCalculatedFund(FundType.FOREIGN).getUnseparatedAmount().toString();
        final String unSeparatedAmountForCashFund = investmentCalculator.getCalculatedFund(FundType.CASH).getUnseparatedAmount().toString();

        final String unSeparatedAmount = investmentCalculator.getUnSeparatedAmount();


        //then
        assertEquals("0.00", unSeparatedAmountForPolishFund);
        assertEquals("0.00", unSeparatedAmountForForeignFund);
        assertEquals("0.00", unSeparatedAmountForCashFund);

        assertEquals("0.00", unSeparatedAmount);

    }



}
