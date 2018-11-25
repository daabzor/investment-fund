package com.mateuszstaskiewicz.investmentfund.calculator;

import com.mateuszstaskiewicz.investmentfund.model.statics.FundType;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class AggressiveInvestmentCalculatorTest extends BaseInvestmentTest {

//Test for example number 1
@Test
public void getAmountInFundForTypeTest1() {
    //given
    final InvestmentCalculator investmentCalculator = new InvestmentCalculatorEngine(AGGRESSIVE_INVESTMENT_AMOUNT_10000, LIST_OF_2_POL_3_FOR_1_CASH_FUNDS);

    //when
    final String amountForPolishFund = investmentCalculator.getCalculatedFund(FundType.POLISH).getDividedAmount().toString();
    final String amountForForeignFund = investmentCalculator.getCalculatedFund(FundType.FOREIGN).getDividedAmount().toString();
    final String amountForCashFund = investmentCalculator.getCalculatedFund(FundType.CASH).getDividedAmount().toString();

    final String aggregatedAmountForPolishFund = investmentCalculator.getAggregatedAmountFor(FundType.POLISH);
    final String aggregatedAmountForForeignFund = investmentCalculator.getAggregatedAmountFor(FundType.FOREIGN);
    final String aggregatedAmountForCashFund = investmentCalculator.getAggregatedAmountFor(FundType.CASH);

    //then
    assertEquals("2000", amountForPolishFund);
    assertEquals("666", amountForForeignFund);
    assertEquals("4000", amountForCashFund);

    assertEquals("4000", aggregatedAmountForPolishFund);
    assertEquals("1998", aggregatedAmountForForeignFund);
    assertEquals("4000", aggregatedAmountForCashFund);

}

@Test
public void getPercentInFundForTypeTest1() {
    //given
    final InvestmentCalculator investmentCalculator = new InvestmentCalculatorEngine(AGGRESSIVE_INVESTMENT_AMOUNT_10000, LIST_OF_2_POL_3_FOR_1_CASH_FUNDS);

    //when
    final String percentForPolishFund = investmentCalculator.getCalculatedFund(FundType.POLISH).getDividedStrategyPercent().toString();
    final String percentForForeignFund = investmentCalculator.getCalculatedFund(FundType.FOREIGN).getDividedStrategyPercent().toString();
    final String percentForCashFund = investmentCalculator.getCalculatedFund(FundType.CASH).getDividedStrategyPercent().toString();

    final String aggregatedPercentForPolishFund = investmentCalculator.getAggregatedPercentFor(FundType.POLISH);
    final String aggregatedPercentForForeignFund = investmentCalculator.getAggregatedPercentFor(FundType.FOREIGN);
    final String aggregatedPercentForCashFund = investmentCalculator.getAggregatedPercentFor(FundType.CASH);

    //then
    assertEquals("0.2000", percentForPolishFund);
    assertEquals("0.0666", percentForForeignFund);
    assertEquals("0.4000", percentForCashFund);

    assertEquals("0.4000", aggregatedPercentForPolishFund);
    assertEquals("0.1998", aggregatedPercentForForeignFund);
    assertEquals("0.4000", aggregatedPercentForCashFund);

}

@Test
public void getUnSeparatedAmountForTypeTest1() {
    //given
    final InvestmentCalculator investmentCalculator = new InvestmentCalculatorEngine(AGGRESSIVE_INVESTMENT_AMOUNT_10000, LIST_OF_2_POL_3_FOR_1_CASH_FUNDS);

    //when
    final String unSeparatedAmountForPolishFund = investmentCalculator.getCalculatedFund(FundType.POLISH).getUnseparatedAmount().toString();
    final String unSeparatedAmountForForeignFund = investmentCalculator.getCalculatedFund(FundType.FOREIGN).getUnseparatedAmount().toString();
    final String unSeparatedAmountForCashFund = investmentCalculator.getCalculatedFund(FundType.CASH).getUnseparatedAmount().toString();

    final String unSeparatedAmount = investmentCalculator.getUnSeparatedAmount();


    //then
    assertEquals("0.00", unSeparatedAmountForPolishFund);
    assertEquals("2.00", unSeparatedAmountForForeignFund);
    assertEquals("0.00", unSeparatedAmountForCashFund);

    assertEquals("2.00", unSeparatedAmount);

}

    //Test for example number 2
    @Test
    public void getAmountInFundForTypeTest2() {
        //given
        final InvestmentCalculator investmentCalculator = new InvestmentCalculatorEngine(AGGRESSIVE_INVESTMENT_AMOUNT_10001, LIST_OF_2_POL_3_FOR_1_CASH_FUNDS);

        //when
        final String amountForPolishFund = investmentCalculator.getCalculatedFund(FundType.POLISH).getDividedAmount().toString();
        final String amountForForeignFund = investmentCalculator.getCalculatedFund(FundType.FOREIGN).getDividedAmount().toString();
        final String amountForCashFund = investmentCalculator.getCalculatedFund(FundType.CASH).getDividedAmount().toString();

        final String aggregatedAmountForPolishFund = investmentCalculator.getAggregatedAmountFor(FundType.POLISH);
        final String aggregatedAmountForForeignFund = investmentCalculator.getAggregatedAmountFor(FundType.FOREIGN);
        final String aggregatedAmountForCashFund = investmentCalculator.getAggregatedAmountFor(FundType.CASH);

        //then
        assertEquals("2000", amountForPolishFund);
        assertEquals("666", amountForForeignFund);
        assertEquals("4000", amountForCashFund);

        assertEquals("4000", aggregatedAmountForPolishFund);
        assertEquals("1998", aggregatedAmountForForeignFund);
        assertEquals("4000", aggregatedAmountForCashFund);
    }

    @Test
    public void getPercentInFundForTypeTest2() {
        //given
        final InvestmentCalculator investmentCalculator = new InvestmentCalculatorEngine(AGGRESSIVE_INVESTMENT_AMOUNT_10001, LIST_OF_2_POL_3_FOR_1_CASH_FUNDS);

        //when
        final String percentForPolishFund = investmentCalculator.getCalculatedFund(FundType.POLISH).getDividedStrategyPercent().toString();
        final String percentForForeignFund = investmentCalculator.getCalculatedFund(FundType.FOREIGN).getDividedStrategyPercent().toString();
        final String percentForCashFund = investmentCalculator.getCalculatedFund(FundType.CASH).getDividedStrategyPercent().toString();

        final String aggregatedPercentForPolishFund = investmentCalculator.getAggregatedPercentFor(FundType.POLISH);
        final String aggregatedPercentForForeignFund = investmentCalculator.getAggregatedPercentFor(FundType.FOREIGN);
        final String aggregatedPercentForCashFund = investmentCalculator.getAggregatedPercentFor(FundType.CASH);

        //then
        assertEquals("0.2000", percentForPolishFund);
        assertEquals("0.0666", percentForForeignFund);
        assertEquals("0.4000", percentForCashFund);

        assertEquals("0.4000", aggregatedPercentForPolishFund);
        assertEquals("0.1998", aggregatedPercentForForeignFund);
        assertEquals("0.4000", aggregatedPercentForCashFund);
    }

    @Test
    public void getUnSeparatedAmountForTypeTest2() {
        //given - test data above
        final InvestmentCalculator investmentCalculator = new InvestmentCalculatorEngine(AGGRESSIVE_INVESTMENT_AMOUNT_10001, LIST_OF_2_POL_3_FOR_1_CASH_FUNDS);

        //when
        final String unSeparatedAmountForPolishFund = investmentCalculator.getCalculatedFund(FundType.POLISH).getUnseparatedAmount().toString();
        final String unSeparatedAmountForForeignFund = investmentCalculator.getCalculatedFund(FundType.FOREIGN).getUnseparatedAmount().toString();
        final String unSeparatedAmountForCashFund = investmentCalculator.getCalculatedFund(FundType.CASH).getUnseparatedAmount().toString();

        final String unSeparatedAmount = investmentCalculator.getUnSeparatedAmount();


        //then
        assertEquals("0.40", unSeparatedAmountForPolishFund);
        assertEquals("2.20", unSeparatedAmountForForeignFund);
        assertEquals("0.40", unSeparatedAmountForCashFund);

        assertEquals("3.00", unSeparatedAmount);
    }

    //Test for example number 3
    @Test
    public void getAmountInFundForTypeTest3() {
        //given
        final InvestmentCalculator investmentCalculator = new InvestmentCalculatorEngine(AGGRESSIVE_INVESTMENT_AMOUNT_10005, LIST_OF_3_POL_2_FOR_1_CASH_FUNDS);

        //when
        final String amountForPolishFund = investmentCalculator.getCalculatedFund(FundType.POLISH).getDividedAmount().toString();
        final String amountForForeignFund = investmentCalculator.getCalculatedFund(FundType.FOREIGN).getDividedAmount().toString();
        final String amountForCashFund = investmentCalculator.getCalculatedFund(FundType.CASH).getDividedAmount().toString();

        final String aggregatedAmountForPolishFund = investmentCalculator.getAggregatedAmountFor(FundType.POLISH);
        final String aggregatedAmountForForeignFund = investmentCalculator.getAggregatedAmountFor(FundType.FOREIGN);
        final String aggregatedAmountForCashFund = investmentCalculator.getAggregatedAmountFor(FundType.CASH);

        //then
        assertEquals("1334", amountForPolishFund);
        assertEquals("1000", amountForForeignFund);
        assertEquals("4002", amountForCashFund);

        assertEquals("4002", aggregatedAmountForPolishFund);
        assertEquals("2000", aggregatedAmountForForeignFund);
        assertEquals("4002", aggregatedAmountForCashFund);
    }

    @Test
    public void getPercentInFundForTypeTest3() {
        //given
        final InvestmentCalculator investmentCalculator = new InvestmentCalculatorEngine(AGGRESSIVE_INVESTMENT_AMOUNT_10005, LIST_OF_3_POL_2_FOR_1_CASH_FUNDS);

        //when
        final String percentForPolishFund = investmentCalculator.getCalculatedFund(FundType.POLISH).getDividedStrategyPercent().toString();
        final String percentForForeignFund = investmentCalculator.getCalculatedFund(FundType.FOREIGN).getDividedStrategyPercent().toString();
        final String percentForCashFund = investmentCalculator.getCalculatedFund(FundType.CASH).getDividedStrategyPercent().toString();

        final String aggregatedPercentForPolishFund = investmentCalculator.getAggregatedPercentFor(FundType.POLISH);
        final String aggregatedPercentForForeignFund = investmentCalculator.getAggregatedPercentFor(FundType.FOREIGN);
        final String aggregatedPercentForCashFund = investmentCalculator.getAggregatedPercentFor(FundType.CASH);

        //then
        assertEquals("0.1333", percentForPolishFund);
        assertEquals("0.1000", percentForForeignFund);
        assertEquals("0.4000", percentForCashFund);

        assertEquals("0.3999", aggregatedPercentForPolishFund);
        assertEquals("0.2000", aggregatedPercentForForeignFund);
        assertEquals("0.4000", aggregatedPercentForCashFund);
    }

    @Test
    public void getUnSeparatedAmountForTypeTest3() {
        //given
        final InvestmentCalculator investmentCalculator = new InvestmentCalculatorEngine(AGGRESSIVE_INVESTMENT_AMOUNT_10005, LIST_OF_3_POL_2_FOR_1_CASH_FUNDS);

        //when
        final String unSeparatedAmountForPolishFund = investmentCalculator.getCalculatedFund(FundType.POLISH).getUnseparatedAmount().toString();
        final String unSeparatedAmountForForeignFund = investmentCalculator.getCalculatedFund(FundType.FOREIGN).getUnseparatedAmount().toString();
        final String unSeparatedAmountForCashFund = investmentCalculator.getCalculatedFund(FundType.CASH).getUnseparatedAmount().toString();

        final String unSeparatedAmount = investmentCalculator.getUnSeparatedAmount();

        //then
        assertEquals("0.00", unSeparatedAmountForPolishFund);
        assertEquals("1.00", unSeparatedAmountForForeignFund);
        assertEquals("0.00", unSeparatedAmountForCashFund);

        assertEquals("1.00", unSeparatedAmount);
    }
}
