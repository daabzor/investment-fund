package com.mateuszstaskiewicz.investmentfund.calculator;

import com.mateuszstaskiewicz.investmentfund.model.statics.FundType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BalancedInvestmentCalculatorTest extends BaseInvestmentTest {

    //Test for example number 1
    @Test
    public void getAmountInFundForTypeTest1() {
        //given
        final InvestmentCalculator investmentCalculator = new InvestmentCalculatorEngine(BALANCED_INVESTMENT_AMOUNT_10000, LIST_OF_2_POL_3_FOR_1_CASH_FUNDS);

        //when
        final String amountForPolishFund = investmentCalculator.getCalculatedFund(FundType.POLISH).getDividedAmount().toString();
        final String amountForForeignFund = investmentCalculator.getCalculatedFund(FundType.FOREIGN).getDividedAmount().toString();
        final String amountForCashFund = investmentCalculator.getCalculatedFund(FundType.CASH).getDividedAmount().toString();

        final String aggregatedAmountForPolishFund = investmentCalculator.getAggregatedAmountFor(FundType.POLISH);
        final String aggregatedAmountForForeignFund = investmentCalculator.getAggregatedAmountFor(FundType.FOREIGN);
        final String aggregatedAmountForCashFund = investmentCalculator.getAggregatedAmountFor(FundType.CASH);

        //then
        assertEquals("1500", amountForPolishFund);
        assertEquals("2000", amountForForeignFund);
        assertEquals("1000", amountForCashFund);

        assertEquals("3000", aggregatedAmountForPolishFund);
        assertEquals("6000", aggregatedAmountForForeignFund);
        assertEquals("1000", aggregatedAmountForCashFund);

    }

    @Test
    public void getPercentInFundForTypeTest1() {
        //given
        final InvestmentCalculator investmentCalculator = new InvestmentCalculatorEngine(BALANCED_INVESTMENT_AMOUNT_10000, LIST_OF_2_POL_3_FOR_1_CASH_FUNDS);

        //when
        final String percentForPolishFund = investmentCalculator.getCalculatedFund(FundType.POLISH).getDividedStrategyPercent().toString();
        final String percentForForeignFund = investmentCalculator.getCalculatedFund(FundType.FOREIGN).getDividedStrategyPercent().toString();
        final String percentForCashFund = investmentCalculator.getCalculatedFund(FundType.CASH).getDividedStrategyPercent().toString();

        final String aggregatedPercentForPolishFund = investmentCalculator.getAggregatedPercentFor(FundType.POLISH);
        final String aggregatedPercentForForeignFund = investmentCalculator.getAggregatedPercentFor(FundType.FOREIGN);
        final String aggregatedPercentForCashFund = investmentCalculator.getAggregatedPercentFor(FundType.CASH);

        //then
        assertEquals("0.1500", percentForPolishFund);
        assertEquals("0.2000", percentForForeignFund);
        assertEquals("0.1000", percentForCashFund);

        assertEquals("0.3000", aggregatedPercentForPolishFund);
        assertEquals("0.6000", aggregatedPercentForForeignFund);
        assertEquals("0.1000", aggregatedPercentForCashFund);

    }

    @Test
    public void getUnSeparatedAmountForTypeTest1() {
        //given
        final InvestmentCalculator investmentCalculator = new InvestmentCalculatorEngine(BALANCED_INVESTMENT_AMOUNT_10000, LIST_OF_2_POL_3_FOR_1_CASH_FUNDS);

        //when
        final String unSeparatedAmountForPolishFund = investmentCalculator.getCalculatedFund(FundType.POLISH).getUnSeparatedAmount().toString();
        final String unSeparatedAmountForForeignFund = investmentCalculator.getCalculatedFund(FundType.FOREIGN).getUnSeparatedAmount().toString();
        final String unSeparatedAmountForCashFund = investmentCalculator.getCalculatedFund(FundType.CASH).getUnSeparatedAmount().toString();

        final String unSeparatedAmount = investmentCalculator.getUnSeparatedAmount();


        //then
        assertEquals("0.00", unSeparatedAmountForPolishFund);
        assertEquals("0.00", unSeparatedAmountForForeignFund);
        assertEquals("0.00", unSeparatedAmountForCashFund);

        assertEquals("0.00", unSeparatedAmount);

    }

    //Test for example number 2
    @Test
    public void getAmountInFundForTypeTest2() {
        //given
        final InvestmentCalculator investmentCalculator = new InvestmentCalculatorEngine(BALANCED_INVESTMENT_AMOUNT_10001, LIST_OF_2_POL_3_FOR_1_CASH_FUNDS);

        //when
        final String amountForPolishFund = investmentCalculator.getCalculatedFund(FundType.POLISH).getDividedAmount().toString();
        final String amountForForeignFund = investmentCalculator.getCalculatedFund(FundType.FOREIGN).getDividedAmount().toString();
        final String amountForCashFund = investmentCalculator.getCalculatedFund(FundType.CASH).getDividedAmount().toString();

        final String aggregatedAmountForPolishFund = investmentCalculator.getAggregatedAmountFor(FundType.POLISH);
        final String aggregatedAmountForForeignFund = investmentCalculator.getAggregatedAmountFor(FundType.FOREIGN);
        final String aggregatedAmountForCashFund = investmentCalculator.getAggregatedAmountFor(FundType.CASH);

        //then
        assertEquals("1500", amountForPolishFund);
        assertEquals("2000", amountForForeignFund);
        assertEquals("1000", amountForCashFund);

        assertEquals("3000", aggregatedAmountForPolishFund);
        assertEquals("6000", aggregatedAmountForForeignFund);
        assertEquals("1000", aggregatedAmountForCashFund);
    }

    @Test
    public void getPercentInFundForTypeTest2() {
        //given
        final InvestmentCalculator investmentCalculator = new InvestmentCalculatorEngine(BALANCED_INVESTMENT_AMOUNT_10001, LIST_OF_2_POL_3_FOR_1_CASH_FUNDS);

        //when
        final String percentForPolishFund = investmentCalculator.getCalculatedFund(FundType.POLISH).getDividedStrategyPercent().toString();
        final String percentForForeignFund = investmentCalculator.getCalculatedFund(FundType.FOREIGN).getDividedStrategyPercent().toString();
        final String percentForCashFund = investmentCalculator.getCalculatedFund(FundType.CASH).getDividedStrategyPercent().toString();

        final String aggregatedPercentForPolishFund = investmentCalculator.getAggregatedPercentFor(FundType.POLISH);
        final String aggregatedPercentForForeignFund = investmentCalculator.getAggregatedPercentFor(FundType.FOREIGN);
        final String aggregatedPercentForCashFund = investmentCalculator.getAggregatedPercentFor(FundType.CASH);

        //then
        assertEquals("0.1500", percentForPolishFund);
        assertEquals("0.2000", percentForForeignFund);
        assertEquals("0.1000", percentForCashFund);

        assertEquals("0.3000", aggregatedPercentForPolishFund);
        assertEquals("0.6000", aggregatedPercentForForeignFund);
        assertEquals("0.1000", aggregatedPercentForCashFund);
    }

    @Test
    public void getUnSeparatedAmountForTypeTest2() {
        //given
        final InvestmentCalculator investmentCalculator = new InvestmentCalculatorEngine(BALANCED_INVESTMENT_AMOUNT_10001, LIST_OF_2_POL_3_FOR_1_CASH_FUNDS);

        //when
        final String unSeparatedAmountForPolishFund = investmentCalculator.getCalculatedFund(FundType.POLISH).getUnSeparatedAmount().toString();
        final String unSeparatedAmountForForeignFund = investmentCalculator.getCalculatedFund(FundType.FOREIGN).getUnSeparatedAmount().toString();
        final String unSeparatedAmountForCashFund = investmentCalculator.getCalculatedFund(FundType.CASH).getUnSeparatedAmount().toString();

        final String unSeparatedAmount = investmentCalculator.getUnSeparatedAmount();


        //then
        assertEquals("0.30", unSeparatedAmountForPolishFund);
        assertEquals("0.60", unSeparatedAmountForForeignFund);
        assertEquals("0.10", unSeparatedAmountForCashFund);

        assertEquals("1.00", unSeparatedAmount);
    }

    //Test for example number 3
    @Test
    public void getAmountInFundForTypeTest3() {
        //given
        final InvestmentCalculator investmentCalculator = new InvestmentCalculatorEngine(BALANCED_INVESTMENT_AMOUNT_10005, LIST_OF_3_POL_2_FOR_1_CASH_FUNDS);

        //when
        final String amountForPolishFund = investmentCalculator.getCalculatedFund(FundType.POLISH).getDividedAmount().toString();
        final String amountForForeignFund = investmentCalculator.getCalculatedFund(FundType.FOREIGN).getDividedAmount().toString();
        final String amountForCashFund = investmentCalculator.getCalculatedFund(FundType.CASH).getDividedAmount().toString();

        final String aggregatedAmountForPolishFund = investmentCalculator.getAggregatedAmountFor(FundType.POLISH);
        final String aggregatedAmountForForeignFund = investmentCalculator.getAggregatedAmountFor(FundType.FOREIGN);
        final String aggregatedAmountForCashFund = investmentCalculator.getAggregatedAmountFor(FundType.CASH);

        //then
        assertEquals("1000", amountForPolishFund);
        assertEquals("3001", amountForForeignFund);
        assertEquals("1000", amountForCashFund);

        assertEquals("3000", aggregatedAmountForPolishFund);
        assertEquals("6002", aggregatedAmountForForeignFund);
        assertEquals("1000", aggregatedAmountForCashFund);
    }

    @Test
    public void getPercentInFundForTypeTest3() {
        //given
        final InvestmentCalculator investmentCalculator = new InvestmentCalculatorEngine(BALANCED_INVESTMENT_AMOUNT_10005, LIST_OF_3_POL_2_FOR_1_CASH_FUNDS);

        //when
        final String percentForPolishFund = investmentCalculator.getCalculatedFund(FundType.POLISH).getDividedStrategyPercent().toString();
        final String percentForForeignFund = investmentCalculator.getCalculatedFund(FundType.FOREIGN).getDividedStrategyPercent().toString();
        final String percentForCashFund = investmentCalculator.getCalculatedFund(FundType.CASH).getDividedStrategyPercent().toString();

        final String aggregatedPercentForPolishFund = investmentCalculator.getAggregatedPercentFor(FundType.POLISH);
        final String aggregatedPercentForForeignFund = investmentCalculator.getAggregatedPercentFor(FundType.FOREIGN);
        final String aggregatedPercentForCashFund = investmentCalculator.getAggregatedPercentFor(FundType.CASH);

        //then
        assertEquals("0.1000", percentForPolishFund);
        assertEquals("0.3000", percentForForeignFund);
        assertEquals("0.1000", percentForCashFund);

        assertEquals("0.3000", aggregatedPercentForPolishFund);
        assertEquals("0.6000", aggregatedPercentForForeignFund);
        assertEquals("0.1000", aggregatedPercentForCashFund);
    }

    @Test
    public void getUnSeparatedAmountForTypeTest3() {
        //given
        final InvestmentCalculator investmentCalculator = new InvestmentCalculatorEngine(BALANCED_INVESTMENT_AMOUNT_10005, LIST_OF_3_POL_2_FOR_1_CASH_FUNDS);

        //when
        final String unSeparatedAmountForPolishFund = investmentCalculator.getCalculatedFund(FundType.POLISH).getUnSeparatedAmount().toString();
        final String unSeparatedAmountForForeignFund = investmentCalculator.getCalculatedFund(FundType.FOREIGN).getUnSeparatedAmount().toString();
        final String unSeparatedAmountForCashFund = investmentCalculator.getCalculatedFund(FundType.CASH).getUnSeparatedAmount().toString();

        final String unSeparatedAmount = investmentCalculator.getUnSeparatedAmount();

        //then
        assertEquals("1.50", unSeparatedAmountForPolishFund);
        assertEquals("1.00", unSeparatedAmountForForeignFund);
        assertEquals("0.50", unSeparatedAmountForCashFund);

        assertEquals("3.00", unSeparatedAmount);
    }
}
